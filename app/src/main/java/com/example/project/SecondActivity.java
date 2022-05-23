package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21rammo";
    private RecyclerView recyclerView;
    private ProgrammingAdapter programmingAdapter;
    private ArrayList<ProgrammingLanguages> mProgrammingData;
    private Gson gson;
    private Type type;
    private Button detailsBack_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.mRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mProgrammingData = new ArrayList<ProgrammingLanguages>();
        programmingAdapter = new ProgrammingAdapter(mProgrammingData);
        recyclerView.setAdapter(programmingAdapter);

        gson = new Gson();
        type = new TypeToken<ArrayList<ProgrammingLanguages>>() {}.getType();

        new JsonTask(this).execute(JSON_URL);

        detailsBack_btn = findViewById(R.id.back_btn);
        detailsBack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackButton();
            }
        });

    }

    private void onBackButton() {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("SecondActivity", json);
        // Creating a new temporary list, We will fetch the json data and put it in there before updating the mountain list.
        ArrayList<ProgrammingLanguages> temp = new ArrayList <ProgrammingLanguages>();
        temp = gson.fromJson(json, type);
        // Clearing the current arraylist before adding the newly fetched one.
        mProgrammingData.clear();
        mProgrammingData.addAll(temp);
        programmingAdapter.notifyDataSetChanged();

    }
}
