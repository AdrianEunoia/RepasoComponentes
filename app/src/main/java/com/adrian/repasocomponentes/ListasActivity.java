package com.adrian.repasocomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.adrian.repasocomponentes.Adaptadores.AdaptadorListas;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

public class ListasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    // VAR ELEMENTOS
    // Elementos
    ListView idLista;
    // Lista
    ArrayList listaPersonas;
    AdaptadorListas adaptadorListas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);
        instancias();
        acciones();
        rellenarLista();
    }

    private void acciones() {
        idLista.setOnItemClickListener(this);
    }

    private void instancias() {
        idLista = findViewById(R.id.idLista);
        listaPersonas = new ArrayList();
        adaptadorListas = new AdaptadorListas(listaPersonas,getApplicationContext());
        idLista.setAdapter(adaptadorListas);
    }

    private void rellenarLista() {
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        adaptadorListas.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.idLista:
                Persona personaEncontrada = (Persona) adaptadorListas.getItem(position);
                Toast.makeText(this, personaEncontrada.getNombre(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
