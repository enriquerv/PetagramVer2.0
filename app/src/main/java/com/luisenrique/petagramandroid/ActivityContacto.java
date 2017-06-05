package com.luisenrique.petagramandroid;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.luisenrique.petagramandroid.MainActivity;
import com.luisenrique.petagramandroid.R;

public class ActivityContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    public void mensajeEnviado(View v){

        Toast.makeText(v.getContext(), "Mensaje enviado", Toast.LENGTH_SHORT).show();
        //Toast.makeText(v.getContext(), "Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
        TextInputEditText nombre = (TextInputEditText) findViewById(R.id.nombre);
        TextInputEditText correo = (TextInputEditText) findViewById(R.id.correo);
        TextInputEditText mensaje = (TextInputEditText) findViewById(R.id.mensaje);

        nombre.setText("");
        correo.setText("");
        mensaje.setText("");
    }

    public void irMascotas(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

