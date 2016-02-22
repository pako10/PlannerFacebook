package plannerland.plannerland;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by plannerland on 21/01/2016.
 */
public class Doctores extends Fragment {

    RelativeLayout otra;
    ImageView hola;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.doctores, container, false);

        otra =(RelativeLayout)view.findViewById(R.id.relative);
        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otra = new Intent(getActivity(), DoctorScrolling.class);
                startActivity(otra);

            }
        });


        return view;
    }
}
