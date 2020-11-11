package com.example.ltapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
  String[] languagesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        languagesData = new String[]{"english","hindi","Tamil","kannada"};
        RecyclerView recyclerview =  findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(this,languagesData);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
    }
}