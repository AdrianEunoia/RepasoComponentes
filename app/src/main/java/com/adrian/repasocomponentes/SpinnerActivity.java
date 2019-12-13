package com.adrian.repasocomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.adrian.repasocomponentes.Adaptadores.AdaptadorSpinner;
import com.adrian.repasocomponentes.Utiles.Persona;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    // VAR ELEMENTOS
    // Spìnner
    Spinner idSpinner;
    ArrayList listaPersonas;
    AdaptadorSpinner adaptadorSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        instancias();
        rellenearSpinner();
    }

    private void instancias() {
        idSpinner = this.findViewById(R.id.idSpinner);
        listaPersonas = new ArrayList();
        adaptadorSpinner = new AdaptadorSpinner(listaPersonas,getApplicationContext());
        idSpinner.setAdapter(adaptadorSpinner);
    }

    private void rellenearSpinner() {
        listaPersonas.add(new Persona("Adrian","Garcia",R.drawable.jugador));
        listaPersonas.add(new Persona("Antonio","Gomez",R.drawable.jugador));
        listaPersonas.add(new Persona("Alvaro","Sanchis",R.drawable.jugador));
        adaptadorSpinner.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
