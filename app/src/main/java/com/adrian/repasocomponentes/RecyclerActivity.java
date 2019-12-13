package com.adrian.repasocomponentes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.adrian.repasocomponentes.Adaptadores.AdaptadorRecycler;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity implements AdaptadorRecycler.OnMiRecyclerListener {
    // VAR ELEMENTOS
    RecyclerView idRecycler;
    ArrayList<Persona> listaPersonas;
    AdaptadorRecycler adaptadorRecycler;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        instancias();
        acciones();
        rellenarRecycler();
    }

    private void instancias() {
        idRecycler = findViewById(R.id.idRecycler);
        listaPersonas = new ArrayList();
        adaptadorRecycler = new AdaptadorRecycler(RecyclerActivity.this,listaPersonas);
        idRecycler.setAdapter(adaptadorRecycler);
        idRecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void acciones() {

    }

    private void rellenarRecycler() {
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        adaptadorRecycler.notifyDataSetChanged();
    }

    @Override
    public void onMiRecycler(Persona persona) {
        System.out.println(persona.getNombre());
    }
}
