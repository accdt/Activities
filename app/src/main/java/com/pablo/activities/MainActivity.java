package com.pablo.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;


public class MainActivity extends AppCompatActivity {

    private final static int MI_REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*private void fecha (View v){
        DatePicker datePicker = (DatePicker) findViewById(R.id.dpFecha);
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth() + 1;
        int year = datePicker.getYear();
    }*/

    public void datos (View v){
        TextInputEditText tiNombre = (TextInputEditText) findViewById(R.id.tiNombre);
        TextInputEditText tiTelefono = (TextInputEditText) findViewById(R.id.tiTelefono);
        TextInputEditText tiEmail = (TextInputEditText) findViewById(R.id.tiEmail);
        TextInputEditText tiDescripcion = (TextInputEditText) findViewById(R.id.tiDescrip);
        DatePicker dpFecha = (DatePicker) findViewById(R.id.dpFecha);

        Integer month = dpFecha.getMonth();
        Integer year = dpFecha.getYear();
        Integer day = dpFecha.getDayOfMonth();
        StringBuilder sb=new StringBuilder();
        sb.append(day.toString()).append("-").append(month.toString()).append("-").append(year.toString());
        String fecha = sb.toString();


        Intent datos = new Intent(MainActivity.this, ConfirmarDatos.class);
        datos.putExtra(getString(R.string.pnombre), tiNombre.getText().toString());
        datos.putExtra(getString(R.string.ptelefono), tiTelefono.getText().toString());
        datos.putExtra(getString(R.string.pemail), tiEmail.getText().toString());
        datos.putExtra(getString(R.string.pdescripcion), tiDescripcion.getText().toString());
        datos.putExtra("fecha",fecha);

        startActivityForResult(datos, MI_REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == MI_REQUEST_CODE){
            if(resultCode == RESULT_OK){

            }
        }
    }
}
