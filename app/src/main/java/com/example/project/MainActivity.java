package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button information_btn;
    Button about_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        information_btn = findViewById(R.id.information_btn);
        information_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickInformation();
            }
        });
        about_btn = findViewById(R.id.about_btn);
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickAbout();
            }
        });
    }
    private void onClickAbout() {
        Intent aboutIntent = new Intent(MainActivity.this, About.class);
        startActivity(aboutIntent);
    }
    private void onClickInformation() {
        Intent infoIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(infoIntent);
    }
}
