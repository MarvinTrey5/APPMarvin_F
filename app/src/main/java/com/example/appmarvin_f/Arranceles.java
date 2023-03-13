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

public class Arranceles extends Fragment {
    TextView Parvularia, Graduado, Instituto, Universidad,Ciclo, Materias;
    Button Ir;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Arran = inflater.inflate(R.layout.fragment_arranceles, container, false);
        // Se referencian los TextView
        Parvularia = Arran.findViewById(R.id.txt_Parv);
        Graduado = Arran.findViewById(R.id.txt_Gradu);
        Instituto = Arran.findViewById(R.id.txt_Ins);
        Universidad = Arran.findViewById(R.id.txt_Uni);
        Ciclo = Arran.findViewById(R.id.txt_Ciclo);
        Materias = Arran.findViewById(R.id.txt_Mater);
        // Se envían los datos a los textview
        String inicio = "Escuela Parvularía De Lolotiquillo";
        Parvularia.setText(inicio);
        String secundaría = "Centro Escolar De Lolotiquillo";
        Graduado.setText(secundaría);
        String INGO = "Instituto Nacional 14 De Julio De 1875";
        Instituto.setText(INGO);
        String Meta = "Universidad Capital Gerardo Barrios";
        Universidad.setText(Meta);
        String nota = "3";
        Ciclo.setText( nota );
        String numM = "4";
        Materias.setText( numM );
        // Se referencia el botón.
        Ir = Arran.findViewById(R.id.Enviar_URL);
        Ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // El botón almacena la función de ir
                // a la URL de la dicha universidad Establecidad.
                Uri nuevo = Uri.parse("https://ugb.edu.sv/");
                Intent ir = new Intent(Intent.ACTION_VIEW, nuevo);
                startActivity(ir);
            }
        });
        //retorna la variable del View Del onCreate.
        return Arran;
    }
}