package com.curso.iedeveloper.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class UserProfileActivity extends AppCompatActivity {

    private TextView nombre,ciudad,edad,contrasena,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mira la otra vista que hice", Snackbar.LENGTH_LONG)
                        .setAction("Acceder", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(UserProfileActivity.this,MainActivity.class));
                            }
                        }).show();

            }
        });

        nombre=(TextView)findViewById(R.id.txtNombre);
        email=(TextView)findViewById(R.id.txtEmail);
        contrasena=(TextView)findViewById(R.id.txtContrasena);
        ciudad=(TextView)findViewById(R.id.txtCiudad);
        edad=(TextView)findViewById(R.id.txtEdad);

        nombre.setText(getIntent().getStringExtra("nombre"));
        edad.setText(getIntent().getStringExtra("edad"));
        ciudad.setText(getIntent().getStringExtra("ciudad"));
        contrasena.setText(getIntent().getStringExtra("contrasena"));
        email.setText(getIntent().getStringExtra("email"));
    }

}
