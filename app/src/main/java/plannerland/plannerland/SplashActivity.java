package plannerland.plannerland;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
    /**
     * Variables para la asignacion de los tiempo
     **/

    public static final int Segundos = 5;
    public static final int delay = 2;
    public static final int milisegundos = Segundos * 1000;
    private ProgressBar progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progreso = (ProgressBar) findViewById(R.id.progressBarinicio);
        progreso.setMax(maximo_progreso());
        empezaranima();
    }

    public void empezaranima() {
        new CountDownTimer(milisegundos, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                progreso.setProgress(establecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent op;
                op = new Intent(SplashActivity.this, SesrchActivity.class);
                startActivity(op);
                finish();

            }
        }.start();
    }

    public int establecer_progreso(long miliseconds) {
        return (int) ((milisegundos - miliseconds) / 1000);
    }

    public int maximo_progreso() {
        return Segundos - delay;
    }
}

