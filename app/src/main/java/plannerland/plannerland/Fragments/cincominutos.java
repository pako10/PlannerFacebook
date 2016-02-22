package plannerland.plannerland.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import plannerland.plannerland.DoctorScrolling;
import plannerland.plannerland.R;

/**
 * Created by plannerland on 11/02/2016.
 */
public class cincominutos extends Fragment {
   /** Declaracion de todas las propiedades utilizadas en la linea de la vida*/
    LinearLayout cincominutos;
    TextView vida1;
    TextView vida2;
    TextView vida3;
    TextView vida4;
    TextView vida5;
    Runnable r;
    Thread iniReloj;
    LinearLayout ly;
    LinearLayout ly2;
    LinearLayout ly3;
    LinearLayout ly4;
    LinearLayout ly5;
    LinearLayout ly6;
    final Handler handler = new Handler();


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sevedInstanceState){
        final View view = inflater.inflate(R.layout.cincominutos, container, false);

        vida1 = (TextView) view.findViewById(R.id.textView2);
        vida2 = (TextView) view.findViewById(R.id.textView3);
        vida3 = (TextView) view.findViewById(R.id.textView4);
        vida4 = (TextView) view.findViewById(R.id.textView5);
        vida5 = (TextView) view.findViewById(R.id.textView6);

        ly = (LinearLayout) view.findViewById(R.id.linearLayout);
        ly2 = (LinearLayout) view.findViewById(R.id.linearLayout3);
        ly3 = (LinearLayout) view.findViewById(R.id.linearLayout4);
        ly4 = (LinearLayout) view.findViewById(R.id.linearLayout5);
        ly5 = (LinearLayout) view.findViewById(R.id.linearLayout7);



        runnable.run();

        cincominutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
        return view;
    }
    public void setTime(){
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();

        if(today.minute < 20) {
            vida1.setText(today.hour + ":" + today.minute + ":" + today.second + "");
            vida2.setText(today.hour + ":" + 20 + ":" + today.second + "");
            vida3.setText(today.hour + ":" + 40 + ":" + today.second + "");
            vida4.setText((today.hour + 1) + ":" + 0+0 + ":" + today.second + "");
            vida5.setText((today.hour +1) + ":" + 20 + ":" + today.second + "");
            return;
        }
        if(today.minute >= 20 && today.minute < 40){
            vida1.setText(today.hour + ":" + today.minute + ":" + today.second + "");
            vida2.setText(today.hour + ":" + 40 + ":" + today.second + "");
            vida3.setText((today.hour +1) + ":" + 0+0 + ":" + today.second + "");
            vida4.setText((today.hour + 1) + ":" + 20 + ":" + today.second + "");
            vida5.setText((today.hour + 1) + ":" + 40 + ":" + today.second + "");
            ly.setBackgroundColor(getResources().getColor(R.color.md_teal_200));
            ly2.setBackgroundColor(getResources().getColor(R.color.md_teal_300));
            ly3.setBackgroundColor(getResources().getColor(R.color.md_teal_400));
            ly4.setBackgroundColor(getResources().getColor(R.color.md_teal_500));
            ly5.setBackgroundColor(getResources().getColor(R.color.md_teal_A700));
            return;
        }
        if(today.minute >= 40 && today.minute < 60){
            vida1.setText(today.hour + ":" + today.minute + ":" + today.second + "");
            vida2.setText((today.hour + 1) + ":" + 0+0 + ":" + today.second + "");
            vida3.setText((today.hour +1) + ":" + 20 + ":" + today.second + "");
            vida4.setText((today.hour + 1) + ":" + 40 + ":" + today.second + "");
            vida5.setText((today.hour +2) + ":" + 0+0 + ":" + today.second + "");
            ly.setBackgroundColor(getResources().getColor(R.color.md_teal_200));
            ly2.setBackgroundColor(getResources().getColor(R.color.md_teal_300));
            ly3.setBackgroundColor(getResources().getColor(R.color.md_teal_400));
            ly4.setBackgroundColor(getResources().getColor(R.color.md_teal_500));
            ly5.setBackgroundColor(getResources().getColor(R.color.md_teal_A700));
            return;
        }
        return;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            setTime();
            handler.postDelayed(runnable, 1000);
        }
    };
}
