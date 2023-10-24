package com.example.ciudadesconboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCiudad;
    private TextView textViewCiudad;
    private String seleccion;
    String [] opciones = {"Badajoz","Mérida","Zafra","Plasencia"};
    private Button generar, comprobar;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextCiudad = (EditText) findViewById(R.id.editTextCiudad);
        textViewCiudad = (TextView) findViewById(R.id.textViewCiudadIncompleta);
        generar = (Button) findViewById(R.id.buttonAleatorio);
        comprobar = (Button) findViewById(R.id.buttonComprobar);
        int indice = random.nextInt(opciones.length);
        String texto = opciones[indice];

        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (texto.equals("Badajoz")){
                    textViewCiudad.setText("B______");
                }else if(texto.equals("Mérida")){
                    textViewCiudad.setText("M_____");
                }else if(texto.equals("Zafra")){
                    textViewCiudad.setText("Z____");
                }else{
                    textViewCiudad.setText("P________");
                }

            }

        });

        comprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (texto.equals(editTextCiudad.getText().toString())){
                    Toast.makeText(v.getContext(),"Correcto",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}