package com.pablo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvMNombre;
    TextView tvMTelefono;
    TextView tvMEmail;
    TextView tvMDescripcion;
    TextView tvMFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        tvMNombre = (TextView) findViewById(R.id.tvMNombre);
        tvMTelefono = (TextView) findViewById(R.id.tvMTelefono);
        tvMEmail = (TextView) findViewById(R.id.tvMEmail);
        tvMDescripcion = (TextView) findViewById(R.id.tvMDescripcion);
        tvMFecha = (TextView) findViewById(R.id.tvMFecha);

            Intent datos = getIntent();
            tvMNombre.setText("Nombre: " +  datos.getStringExtra("nombre"));
            tvMTelefono.setText("Telefono: " + datos.getStringExtra("telefono"));
            tvMEmail.setText("Email: " + datos.getStringExtra("email"));
            tvMDescripcion.setText(datos.getStringExtra("descripcion"));
            tvMFecha.setText("Fecha " + datos.getStringExtra("fecha"));
    }

    public void volver (View v){
        Intent datos = new Intent();

        setResult(RESULT_OK,datos);
        finish();
    }
}
