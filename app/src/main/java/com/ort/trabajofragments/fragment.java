package com.ort.trabajofragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;



public class fragment  extends Fragment implements View.OnClickListener{
EditText ingresocudad;
Button miboton;
public View onCreateView(LayoutInflater inflador, ViewGroup migrupo, Bundle datosrecibidos){
    View vista_devolver;
    vista_devolver=inflador.inflate (R.layout.ingreso_, migrupo, false);
    ingresocudad=vista_devolver.findViewById (R.id.ingresociudad);
    miboton=vista_devolver.findViewById (R.id.miboton);
    miboton.setOnClickListener (this);
    return vista_devolver;

}
public void onClick(View v){
    String ciudad;
    ciudad=ingresocudad.getText ().toString ();
    actividadprincipal miactivity;
    miactivity=(actividadprincipal)getActivity ();
    miactivity.recibirdatos (ciudad);

}
}
