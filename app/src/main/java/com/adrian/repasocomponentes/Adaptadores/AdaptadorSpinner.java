package com.adrian.repasocomponentes.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.adrian.repasocomponentes.R;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

public class AdaptadorSpinner extends BaseAdapter {
    // Var
    ArrayList listaPersonas;
    Context context;

    public AdaptadorSpinner(ArrayList listaPersonas, Context context) {
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
        view = LayoutInflater.from(context).inflate(R.layout.adaptador_spinner, viewGroup, false);
        //Persona
        Persona personaEncontrada = (Persona) listaPersonas.get(i);
        // Instancias
        TextView nombre = view.findViewById(R.id.idNombrePersonas);
        TextView apellido = view.findViewById(R.id.idApellidoPersona);
        ImageView imagen = view.findViewById(R.id.idImagenPersona);
        // Set
        nombre.setText(personaEncontrada.getNombre());
        apellido.setText(personaEncontrada.getApellido());
        imagen.setImageResource(personaEncontrada.getFoto());
        return view;
    }
}
