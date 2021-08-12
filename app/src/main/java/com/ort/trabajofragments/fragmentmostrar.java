package com.ort.trabajofragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class fragmentmostrar extends Fragment  {
TextView textomostrar;
public View onCreateView(LayoutInflater inflador, ViewGroup grupo, Bundle paquete){
    View vistadevolver;
    vistadevolver=inflador.inflate (R.layout.mostrar_, grupo, false);
    textomostrar=vistadevolver.findViewById (R.id.ciudadelegida);
    actividadprincipal miactivity;
    miactivity=(actividadprincipal)getActivity ();
    String nombreamostrar;
    nombreamostrar=miactivity.verciudad ();
    textomostrar.setText (nombreamostrar);
    return vistadevolver;
}
}
