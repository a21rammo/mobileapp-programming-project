package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    private Button aboutBack_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutBack_btn = findViewById(R.id.aboutBack_btn);
        aboutBack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackButton();
            }
        });
    }

    private void onBackButton() {
        Intent intent = new Intent(About.this, MainActivity.class);
        startActivity(intent);
    }
}