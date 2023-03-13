package com.example.appmarvin_f;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tecnologia extends Fragment {

    // Objetos a necesitar
    String L_pseint, L_C, L_Csharp, L_CMas_, L_Pthon, Base1, Base2;
    TextView pSeint, C_t, Csharp, CMas_Mas, Python, diseño1, diseño2;
    Button Contactar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Mostrar=  inflater.inflate(R.layout.fragment_tecnologia, container, false);
        // Se referencian aqui.
        pSeint = Mostrar.findViewById(R.id.txt_Mostrar_pSeint);
        C_t = Mostrar.findViewById(R.id.txt_Mostrar_C);
        Csharp = Mostrar.findViewById(R.id.txt_Mostrar_Csharp);
        CMas_Mas = Mostrar.findViewById(R.id.txt_Mostrar_Cmas_mas);
        Python = Mostrar.findViewById(R.id.txt_Mostrar_Python);
        diseño1 = Mostrar.findViewById(R.id.txt_Mostrar_Trello);
        diseño2 = Mostrar.findViewById(R.id.txt_Mostrar_Figma);
        // Se referencia el botón
        Contactar = Mostrar.findViewById(R.id.Enviar_Correo);
        // Damos valores tipo sttring a los textview.
        L_pseint = " pSeint ";
        pSeint.setText( L_pseint );
        L_C = " C ";
        C_t.setText( L_C );
        L_Csharp = " Csharp(#) ";
        Csharp.setText( L_Csharp );
        L_CMas_ = " C++ ";
        CMas_Mas.setText( L_CMas_ );
        L_Pthon = " Python ";
        Python.setText( L_Pthon );
        Base1 = " Trello ";
        diseño1.setText( Base1 );
        Base2 = " Figma ";
        diseño2.setText( Base2 );
        // Función del botón
        Contactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // LLamamos al método.
                Mostrar_Comunicacion();
            }
        });
        // retorna la variable del View Del onCreate.
        return Mostrar;
    }
    // Se crea un método para el botón.
    // almacena ACTION_SEND que nos permitirá abrir otras apps
    // de donde enviar el mensje.
    public void Mostrar_Comunicacion(){
        String Emisor = " Me interesa tus servicios ";
        String Cuerpo_Mensaje = " ";
        Intent Ayuda = new Intent(Intent.ACTION_SEND);
        Ayuda.putExtra(Intent.EXTRA_EMAIL, new String[]{"santosmarvin201@gmail.com"});
        Ayuda.putExtra(Intent.EXTRA_SUBJECT, Emisor);
        Ayuda.putExtra(Intent.EXTRA_TEXT, Cuerpo_Mensaje);
        Ayuda.setType("message/rfc822");
        startActivity(Intent.createChooser(Ayuda, "Ayuda necesaria"));
    }

}