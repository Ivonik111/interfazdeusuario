package com.example.interfazdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView mensaje = (TextView)findViewById(R.id.textView9);
        Bundle envio=this.getIntent().getExtras();
        mensaje.setText("REGISTRADO"+"\n"
        +"Cedula: "+envio.getString("CEDULA")+"\n"
        +"Nombre: "+envio.getString("NOMBRE")+"\n"
        +"Fecha: "+envio.getString("FECHA")+"\n"
        +"Genero: "+envio.getString("GENERO")+"\n"
        +"Ciudad: "+envio.getString("CUIDAD")+"\n"
        +"Correo: "+envio.getString("CORREO")+"\n"
        +"Telefono: "+envio.getString("TELEFONO")+"\n");


    }
}