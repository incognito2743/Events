package com.example.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void OnClick(View v) {
        EditText editTextLogin = findViewById(R.id.editTextLogin);
        EditText editTextPassword = findViewById(R.id.editTextPassword);

        String Login = editTextLogin.getText().toString();
        String Password = editTextPassword.getText().toString();

        if((Login.equals("admin")) && (Password.equals("admin"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("login", editTextLogin.getText().toString());
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Неверный логин или пароль.", Toast.LENGTH_SHORT).show();
        }
    }
}