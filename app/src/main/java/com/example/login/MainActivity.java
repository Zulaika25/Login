package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.et_usuario);
        pass = (EditText) findViewById(R.id.et_pass);
        login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre;
                String contraseña;
                nombre = usuario.getText().toString();
                contraseña = pass.getText().toString();
                if ((nombre.equals("Zulaika")) && (contraseña.equals("12345"))) {
                    Intent intent = new Intent( MainActivity.this,Pantalla2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Usuario o Contraseña", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}