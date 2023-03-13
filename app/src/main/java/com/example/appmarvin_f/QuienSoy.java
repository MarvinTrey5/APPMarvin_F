package com.example.appmarvin_f;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class QuienSoy extends Fragment {
    // Se definen los objetos
    String nombre, apellido,carnet, numero, pass;
    TextView ingrenom, ingreape,ingreid, ingrenum, ingre_pass;
    Button nuevo;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Almacena = inflater.inflate(R.layout.fragment_quien_soy, container, false);
        // Se referencias los obbjetos.
        ingrenom = Almacena.findViewById(R.id.txt_Mostrar_Nom);
        ingreape = Almacena.findViewById(R.id.txt_Mostrar_Apell);
        ingreid = Almacena.findViewById(R.id.txt_Mostrar_Carnet);
        ingrenum = Almacena.findViewById(R.id.txt_Mostrar_Cell);
        ingre_pass = Almacena.findViewById(R.id.txt_Mostrar_Pass);
        // Se envian los datos de tipo string a los TextView Con sus id identificados.
        nombre = "Marvin Javier";
        ingrenom.setText(nombre);
        apellido = "Santos Fernández";
        ingreape.setText(apellido);
        carnet = "SMTS029022";
        ingreid.setText(carnet);
        numero = "+503 73707524";
        ingrenum.setText(numero);
        pass = "Programando";
        ingre_pass.setText(pass);
        // Se refenencia el botón con su funcionabilidad.
        nuevo = Almacena.findViewById(R.id.Enviar_Msj);
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Se llama el método donde se envían los datos.
                Comunicar();
            }
        });
        // retorna la variable del View Del onCreate.
        return Almacena;
    }
    // Se crea un método que almacena los datos del botón.
    public void Comunicar(){
        String message = "Hola, ¿Terminaste tu aplicación?";
        String Minumero = "+50373707524"; //
        Uri Ver = Uri.parse("https://wa.me/" + Minumero + "/?text=" + message );
        Intent Interfaz = new Intent(Intent.ACTION_VIEW, Ver);
        startActivity(Interfaz);

    }
}