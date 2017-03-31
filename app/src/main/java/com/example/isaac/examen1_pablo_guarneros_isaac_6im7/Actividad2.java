package com.example.isaac.examen1_pablo_guarneros_isaac_6im7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Bundle recibe = new Bundle();
        recibe= this.getIntent().getExtras();
        TextView resultado= (TextView)findViewById(R.id.resultado);
        String res =Float.toString(recibe.getFloat("dolares"));
        resultado.setText(res);

    }
    public void onClick(View v) {
        String[] to = { "eoropezag@ipn.mx" };
        String[] cc = { "eoropezag@ipn.mx" };
        TextView resultado= (TextView)findViewById(R.id.resultado);
        String res = String.valueOf(resultado.getText());
        enviar(to, cc, "Examen 1er parcial",res);
    }

    private void enviar(String[] to, String[] cc,
                        String asunto, String mensaje) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_CC, cc);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email "));
    }
}
