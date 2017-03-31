package com.example.isaac.examen1_pablo_guarneros_isaac_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }

    public void onClickConvertir(){
        Intent actividad2 = new Intent(this, Actividad2.class);
        Bundle datos = new Bundle();
        float dolares =0;
        EditText cantidad = (EditText) findViewById(R.id.editText);
        String pesosS = cantidad.getText().toString();
        float pesos = Float.valueOf(pesosS);
        dolares = pesos/15;
        datos.putFloat("dolares", dolares);
        actividad2.putExtras(datos);
        finish();
        startActivity(actividad2);
    }
}
