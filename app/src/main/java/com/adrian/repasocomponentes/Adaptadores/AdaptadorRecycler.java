package com.adrian.repasocomponentes.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adrian.repasocomponentes.R;
import com.adrian.repasocomponentes.RecyclerActivity;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.HolderAdaptadorPersonas> {
    // VAR
    Context context;
    ArrayList<Persona> listaPersonas;
    OnMiRecyclerListener listener;

    // CONSTRUCTOR ADAPTADOR, SOLO PARENT CLASS Y LISTA PASADA
    public AdaptadorRecycler(RecyclerActivity personas, ArrayList<Persona> listaLigas) {
        this.context = personas;
        this.listaPersonas = listaLigas;
        listener = (OnMiRecyclerListener) context;
    }

    @NonNull
    @Override
    public HolderAdaptadorPersonas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // INFLATER CON CONTEXT Y LAYOUT
        View view = LayoutInflater.from(context).inflate(R.layout.adaptador_recycler, parent,false);
        // CREO HOLDER // IMPORTANTE, EL CONSTRUCTOR DE LA CLASE DE MI HOLDER INVOCA DESDE AQUI
        HolderAdaptadorPersonas miHolder = new HolderAdaptadorPersonas(view);
        return miHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull HolderAdaptadorPersonas holder, int position) {
        final Persona personaEncontrada = listaPersonas.get(position);
        holder.getIdNombrePersona().setText(personaEncontrada.getNombre());
        holder.getIdApellidoPersona().setText(personaEncontrada.getApellido());
        holder.getIdImagenPersona().setImageResource(personaEncontrada.getFoto());
        // ACTIONS
        holder.getIdNombrePersona().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(personaEncontrada);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }
    // CLASE MANUAL
    // CLASE HOLDER
    class HolderAdaptadorPersonas extends RecyclerView.ViewHolder {
        // VAR ELEMENTOS LAYOUT
        private ImageView idImagenPersona;
        private TextView idApellidoPersona;
        private TextView idNombrePersona;
        // CONSTRUCTOR HOLDER
        public HolderAdaptadorPersonas(@NonNull View itemView) {
            super(itemView);
            idImagenPersona = itemView.findViewById(R.id.idImagenPersona);
            idNombrePersona = itemView.findViewById(R.id.idNombrePersonas);
            idApellidoPersona = itemView.findViewById(R.id.idApellidoPersona);
        }
        // GETTERS
        public ImageView getIdImagenPersona() { return idImagenPersona; }
        public TextView getIdApellidoPersona() { return idApellidoPersona; }
        public TextView getIdNombrePersona() { return idNombrePersona; }
    }
    // INTERFACE
    public interface OnMiRecyclerListener {
        public void onMiRecycler(Persona persona);
    }
}
