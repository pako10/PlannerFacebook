package plannerland.plannerland.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import plannerland.plannerland.DoctorScrolling;
import plannerland.plannerland.R;

/**
 * Fragmentes para inflar la busqueda
 */
public class Busqueda extends Fragment {

    RelativeLayout doctor;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sevedInstanceState){

        final View view = inflater.inflate(R.layout.doctores, container, false);

        doctor =(RelativeLayout)view.findViewById(R.id.doctoruno);
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gto = new Intent(getActivity(), DoctorScrolling.class);
                startActivity(gto);

            }
        });

        return view;
    }
}
