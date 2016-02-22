package plannerland.plannerland;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import plannerland.plannerland.Fragments.DoctoresDes;

public class DoctorScrolling extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapa(view);
            }
        });
        FloatingActionButton phone = (FloatingActionButton) findViewById(R.id.phone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telefono(view);
            }
        });
        FloatingActionButton cita = (FloatingActionButton) findViewById(R.id.cita);
        cita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cita(view);
            }
        });

    }

    /** Cuadro de Dialogo para Mapa **/
    public void mapa(View v){

        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setTitle(R.string.titulo_dialogo);
        builder.setMessage(R.string.mensaje_mapa);
        builder.setPositiveButton(R.string.entrar, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                Intent op = new Intent(DoctorScrolling.this, LoginActivity.class);
                startActivity(op);

            }
        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();

    }

    /** Cuadro de dialogo para telefono */

    public void telefono(View v){

        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setTitle(R.string.titulo_dialogo);
        builder.setMessage(R.string.mensaje_telefono);
        builder.setPositiveButton(R.string.entrar, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                Intent op = new Intent(DoctorScrolling.this, LoginActivity.class);
                startActivity(op);

            }
        });

        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();

    }

    /** Cuadro de Dialogo para cita **/

    public void cita(View v){

        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setTitle(R.string.titulo_dialogo);
        builder.setMessage(R.string.mensaje_cita);
        builder.setPositiveButton(R.string.entrar, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                Intent op = new Intent(DoctorScrolling.this, LoginActivity.class);
                startActivity(op);

            }
        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();

    }

    /** Metod para los fragmentos*/
    public void setFragment(int position) {
        android.support.v4.app.FragmentManager fragmentManager;
        android.support.v4.app.FragmentTransaction fragmentTransaction;
        switch (position) {
            case 0:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                DoctoresDes doctor = new DoctoresDes();
                fragmentTransaction.replace(R.id.informacion, doctor);
                fragmentTransaction.commit();
                break;

          }
    }
}
