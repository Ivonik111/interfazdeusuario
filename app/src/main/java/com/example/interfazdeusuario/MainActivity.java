package com.example.interfazdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btLimpiar (View view)
    {
        EditText cedu = (EditText)findViewById(R.id.editTextNumber);
        EditText name = (EditText)findViewById(R.id.editTextText4);
        EditText date = (EditText)findViewById(R.id.editTextDate2);
        EditText city = (EditText)findViewById(R.id.editTextText6);
        EditText correo = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        EditText phone = (EditText)findViewById(R.id.editTextPhone4);
        cedu.setText("");
        name.setText("");
        date.setText("");
        city.setText("");
        correo.setText("");
        phone.setText("");

    }
    public void btenviar (View view)

    {
        EditText cedu = (EditText)findViewById(R.id.editTextNumber);
        EditText name = (EditText)findViewById(R.id.editTextText4);
        EditText date = (EditText)findViewById(R.id.editTextDate2);
        EditText city = (EditText)findViewById(R.id.editTextText6);
        EditText correo = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        EditText phone = (EditText)findViewById(R.id.editTextPhone4);
        RadioButton rbMasc= (RadioButton)findViewById(R.id.radioButton7);

        //EditText usuario = (EditText)findViewById(R.id.editUsuario);
        //EditText contraseña = (EditText)findViewById(R.id.editContra);
        String ide, nombre, fecha, cuidad, mail, cell, genero;
        ide= cedu.getText().toString();
        nombre=name.getText().toString();
        fecha=date.getText().toString();
        cuidad=city.getText().toString();
        mail=correo.getText().toString();
        cell=phone.getText().toString();
        genero="Estimad"+ (rbMasc.isChecked()?"o":"a");


        Intent cambio =new Intent(MainActivity.this, MainActivity2.class);
        Bundle envio =new Bundle();
        envio.putString("CEDULA", ide);
        envio.putString("NOMBRE:", nombre);
        envio.putString("FECHA:", fecha);
        envio.getString("GENERO");
        envio.putString("CIUDAD:", cuidad);
        envio.putString("CORREO:", mail);
        envio.putString("TELEFONO:", cell);
        cambio.putExtras(envio);
        startActivity(cambio);


    }


}