package com.curso.iedeveloper.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatEditText nombre,edad,email,contrasena,ciudad;
    private AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initComponents();


    }


    private void initComponents(){
        nombre=(AppCompatEditText)findViewById(R.id.editNombre);
        edad=(AppCompatEditText)findViewById(R.id.editEdad);
        ciudad=(AppCompatEditText)findViewById(R.id.editCiudad);
        contrasena=(AppCompatEditText)findViewById(R.id.editConstrasena);
        email=(AppCompatEditText)findViewById(R.id.editEmail);
        button=(AppCompatButton)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent=new Intent(RegisterActivity.this,UserProfileActivity.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("edad",edad.getText().toString());
                intent.putExtra("contrasena",contrasena.getText().toString());
                intent.putExtra("ciudad",ciudad.getText().toString());
                intent.putExtra("email",email.getText().toString());
                startActivity(intent);
                finish();
        }
    }
}
