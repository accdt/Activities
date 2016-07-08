package com.pablo.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void datos (View v){
        TextInputEditText tiNombre = (TextInputEditText) findViewById(R.id.tiNombre);
        TextInputEditText tiTelefono = (TextInputEditText) findViewById(R.id.tiTelefono);
        TextInputEditText tiEmail = (TextInputEditText) findViewById(R.id.tiEmail);
        TextInputEditText tiDescripcion = (TextInputEditText) findViewById(R.id.tiDescrip);
        DatePicker dpFecha = (DatePicker) findViewById(R.id.dpFecha);

        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra(getResources().getString(R.string.pnombre), tiNombre.getText().toString());
        intent.putExtra(getResources().getString(R.string.ptelefono), tiTelefono.getText().toString());
        intent.putExtra(getResources().getString(R.string.pemail), tiEmail.getText().toString());
        intent.putExtra(getResources().getString(R.string.pdescripcion), tiDescripcion.getText().toString());
        startActivity(intent);


    }
}
