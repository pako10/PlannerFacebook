package plannerland.plannerland.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import plannerland.plannerland.R;
import plannerland.plannerland.RegistroActivity;

public class LoginActivityFb extends AppCompatActivity {

    //Botones Login
    TextView tvResult;
    EditText etUserLogin;
    EditText etPassLogin;
    Button btnOk;
    Button btnCancel;
    TextView parameter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity_fb);

        etUserLogin = (EditText) findViewById(R.id.et_user_login);
        etPassLogin = (EditText) findViewById(R.id.et_user_password);
        btnOk = (Button) findViewById(R.id.btn_user_value_ok);
        //btnCancel   = (Button) findViewById(R.id.btn_user_value_cancel);
        tvResult = (TextView) findViewById(R.id.tv_user_result);
        TextView etRegister = (TextView) findViewById(R.id.registerL);


        etRegister.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        btnOk.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (etUserLogin.getText().toString().trim().length() == 0) {
                        etUserLogin.setError("Usuario no válido");
                        return;
                    }
                    if (etPassLogin.getText().toString().trim().length() == 0) {
                        etPassLogin.setError("Contraseña no válida");
                        return;
                    }
            }
        });



    }

    public void register() {
        Intent i = new Intent(this, RegistroActivityFb.class);
        startActivity(i);
    }

}
