package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contrasenya extends AppCompatActivity {
    EditText correo;
    Button continue1, guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasenya);
        correo=(EditText)findViewById(R.id.correo3);
        guest=(Button)findViewById(R.id.signin3);


        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Contrasenya.this, Ejercicio1.class));
            }
        });

    }
}