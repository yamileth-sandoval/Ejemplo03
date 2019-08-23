package com.uso.ejemplo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables
    private Button btnProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializamos los controles
        this.btnProcesar = findViewById(R.id.btnProcesar);

        //Evento Click en el evento onCreate
        this.btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hola Mundo!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Evento
    public void Onclick(View v){
        Toast.makeText(this, "Hola Mundo 2!", Toast.LENGTH_SHORT).show();
        //Intent nueva =new Intent(this,Tercera.class);
        //startActivity(nueva);
    }
}
