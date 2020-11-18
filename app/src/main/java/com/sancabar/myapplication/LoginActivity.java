package com.sancabar.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {

        EditText editTextEmail = (EditText) findViewById(R.id.text_correo);
        String email = editTextEmail.getText().toString();

        EditText editTextPassword = (EditText) findViewById(R.id.text_contrasena);
        String password = editTextPassword.getText().toString();

        if (!email.equals("mateo.gonzalez")){
            editTextEmail.setError("Usuario no encontrado");
        } else if ( !password.equals("1234") ) {
            editTextPassword.setError("Contraseña incorrecta");
        } else {
            AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();

            alertDialog1.setTitle("Login Sucesfull");

            alertDialog1.show();

        }
    }
}
