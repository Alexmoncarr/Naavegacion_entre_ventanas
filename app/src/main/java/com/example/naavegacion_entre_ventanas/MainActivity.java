package com.example.naavegacion_entre_ventanas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTXT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTXT1 = findViewById(R.id.editTXT1);
    }

    public void siguiente(View view) {
        String dato = editTXT1.getText().toString();
        Intent i = new Intent(this, segundaVista.class);
        i.putExtra("dato", dato);
        startActivity(i);
    }
}
