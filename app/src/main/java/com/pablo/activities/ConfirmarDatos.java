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

    String nombre;
    String telefono;
    String email;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString(getResources().getString(R.string.pnombre));
        telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        email= parametros.getString(getResources().getString(R.string.pemail));
        descripcion= parametros.getString(getResources().getString(R.string.pdescripcion));

        tvMNombre = (TextView) findViewById(R.id.tvMNombre);
        tvMTelefono = (TextView) findViewById(R.id.tvMTelefono);
        tvMEmail = (TextView) findViewById(R.id.tvMEmail);
        tvMDescripcion = (TextView) findViewById(R.id.tvMDescripcion);

        tvMNombre.setText(nombre);
        tvMTelefono.setText(getResources().getString(R.string.dato_telefono) + telefono);
        tvMEmail.setText(getResources().getString(R.string.dato_email) + email);
        tvMDescripcion.setText(getResources().getString(R.string.dato_descripcion) + descripcion);
    }

    public void volver (View v){
        Intent datos = new Intent();

        setResult(RESULT_OK,datos);
        finish();
    }
}
