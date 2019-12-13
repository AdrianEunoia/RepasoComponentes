package com.adrian.repasocomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // VAR
    Button idButtonSpinner,idButtonLista,idButtonRecycler,idButtonPasoDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void instancias() {
        idButtonPasoDatos = findViewById(R.id.idButtonPasoDatos);
        idButtonSpinner = findViewById(R.id.idButtonSpinner);
        idButtonLista = findViewById(R.id.idButtonLista);
        idButtonRecycler = findViewById(R.id.idButtonRecycler);
    }

    private void acciones() {
        idButtonLista.setOnClickListener(this);
        idButtonSpinner.setOnClickListener(this);
        idButtonPasoDatos.setOnClickListener(this);
        idButtonRecycler.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idButtonSpinner:
                // EMPEZAR ACTIVITY
                Intent intentSpinner = new Intent(getApplicationContext(),SpinnerActivity.class);
                startActivity(intentSpinner);
                break;
            case R.id.idButtonLista:
                // EMPEZAR ACTIVITY
                Intent intentLista = new Intent(getApplicationContext(),ListasActivity.class);
                startActivity(intentLista);
                break;
            case R.id.idButtonRecycler:
                // EMPEZAR ACTIVITY
                Intent intentRecycler = new Intent(getApplicationContext(),RecyclerActivity.class);
                startActivity(intentRecycler);
                break;
            case R.id.idButtonPasoDatos:
                // EMPEZAR ACTIVITY
                break;
        }
    }
}
