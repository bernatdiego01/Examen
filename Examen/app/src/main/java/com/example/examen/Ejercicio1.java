package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Ejercicio1 extends AppCompatActivity {
    Button btnN;
    CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        btnN=(Button) findViewById(R.id.next1);
        c1=(CheckBox) findViewById(R.id.checkBox1);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);

        if(c1.isChecked()){
            btnN.setEnabled(true);
        }
        if(c2.isChecked()){
            btnN.setEnabled(true);
        }
        if(c3.isChecked()){
            btnN.setEnabled(true);
        }
        if(c4.isChecked()){
            btnN.setEnabled(true);
        }

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked()){
                    startActivity(new Intent(Contrasenya.this, Ejercicio2.class));
                }
            }
        });



    }
}