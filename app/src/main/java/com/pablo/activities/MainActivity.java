package com.pablo.activities;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static int MI_REQUEST_CODE = 1;
    DatePicker fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void fecha (View v){
        DatePicker datePicker = (DatePicker) findViewById(R.id.dpFecha);
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth() + 1;
        int year = datePicker.getYear();
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
        startActivityForResult(intent, MI_REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == MI_REQUEST_CODE){
            if(resultCode == RESULT_OK){

            }
        }
    }
}
