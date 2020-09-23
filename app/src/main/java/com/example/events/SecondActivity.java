package com.example.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Element;

public class SecondActivity extends AppCompatActivity {

    private String[] Events = {"День города.", "Новый год."};

    private String[] mDates = {"12.06.", "31.12 - 01.01."};

    int[] mImageIds = {R.drawable.star, R.drawable.star_black};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        Intent intent = getIntent();

        String login = intent.getStringExtra("login");

        TextView viewText = findViewById(R.id.helloText);

        viewText.setText("Привет, " + login);
    }

    public void OnClickSearch(View v) {
        EditText editTextSearch = findViewById(R.id.editTextSearch);
        TextView helloText = findViewById(R.id.helloText);

        String strSearch = editTextSearch.getText().toString();

        helloText.setText("По запросу " + strSearch + " ничего не найдено.");
    }

    public void OnClickOtherEvent(View v) {
        Intent intent = new Intent(SecondActivity.this, InfoEventActivity.class);
        startActivity(intent);
    }
}