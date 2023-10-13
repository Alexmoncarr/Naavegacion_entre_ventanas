package com.example.naavegacion_entre_ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class segundaVista extends AppCompatActivity {

    TextView tV1;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_vista);

        tV1 = findViewById(R.id.tV1);
        spinner = findViewById(R.id.spinner);

        String dato = getIntent().getStringExtra("dato");
        tV1.setText("Hola " + dato);

        String[] operaciones = {"Math", "SQL", "Util", "Time"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, operaciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
    public void abrirURL(View view) {
        String url = "https://docs.oracle.com/javase/8/docs/api/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
    }
}
