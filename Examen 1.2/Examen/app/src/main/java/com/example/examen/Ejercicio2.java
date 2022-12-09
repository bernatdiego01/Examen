package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class Ejercicio2 extends AppCompatActivity {
    Button btnN2;
    RadioButton c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        btnN2=(Button) findViewById(R.id.next2);
        c1=(RadioButton) findViewById(R.id.radio1);
        c2=(RadioButton) findViewById(R.id.radio2);
        c3=(RadioButton) findViewById(R.id.radio3);
        c4=(RadioButton) findViewById(R.id.radio4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    btnN2.setEnabled(true);
                }

                if(c3.isChecked() || c2.isChecked() || c1.isChecked() || c4.isChecked()){

                }else{btnN2.setEnabled(false);}
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c2.isChecked()){
                    btnN2.setEnabled(true);
                }

                if(c3.isChecked() || c2.isChecked() || c1.isChecked() || c4.isChecked()){

                }else{btnN2.setEnabled(false);}
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c3.isChecked()){
                    btnN2.setEnabled(true);
                }

                if(c3.isChecked() || c2.isChecked() || c1.isChecked() || c4.isChecked()){

                }else{btnN2.setEnabled(false);}
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c4.isChecked()){
                    btnN2.setEnabled(true);
                }

                if(c3.isChecked() || c2.isChecked() || c1.isChecked() || c4.isChecked()){

                }else{btnN2.setEnabled(false);}
            }
        });


        btnN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ejercicio2.this, Ejercicio3.class));

            }
        });
    }
}