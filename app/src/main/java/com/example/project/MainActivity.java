package com.example.project;

import android.os.Bundle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21rammo";
    private RecyclerView recyclerView;
    private ProgrammingAdapter programmingAdapter;
    private Gson gson;
    private Type type;
    private ArrayList<ProgrammingLanguages> mProgrammingData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mRecyclerView);
        recyclerView = setLayoutManager(new LinearLayoutManager(this));
        mProgrammingData = new ArrayList<ProgrammingLanguages>();
        programmingAdapter = new ProgrammingAdapter(mProgrammingData);
        recyclerView.setAdapter(programmingAdapter);

        gson = new Gson();
        type = new TypeToken<ArrayList<ProgrammingLanguages>>() {}.getType();

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        // Creating a new temporary list, We will fetch the json data and put it in there before updating the mountain list.
        ArrayList<ProgrammingLanguages> temp = new ArrayList <ProgrammingLanguages>();
        temp = gson.fromJson(json, type);
        // Clearing the current arraylist before adding the newly fetched one.
        mProgrammingData.clear();
        mProgrammingData.addAll(temp);
        programmingAdapter.notifyDataSetChanged();
    }

}
