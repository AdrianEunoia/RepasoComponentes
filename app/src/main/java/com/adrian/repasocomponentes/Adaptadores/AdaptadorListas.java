package com.adrian.repasocomponentes.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.adrian.repasocomponentes.R;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

public class AdaptadorListas extends BaseAdapter {
    // Variables adaptador
    ArrayList<Persona> listaPersonas;
    Context context;

    public AdaptadorListas(ArrayList<Persona> listaPersonas, Context context) {
        this.listaPersonas = listaPersonas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    @Override
    public Object getItem(int i) {
        return listaPersonas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.adaptador_lista, viewGroup, false);
        }
        Persona personaEcnontrada = listaPersonas.get(i);
        TextView nombre = view.findViewById(R.id.idNombrePersonas);
        TextView apellido = view.findViewById(R.id.idApellidoPersona);
        ImageView imagen = view.findViewById(R.id.idImagenPersona);

        nombre.setText(personaEcnontrada.getNombre());
        apellido.setText(personaEcnontrada.getApellido());
        imagen.setImageResource(personaEcnontrada.getFoto());

        return view;
    }
}
