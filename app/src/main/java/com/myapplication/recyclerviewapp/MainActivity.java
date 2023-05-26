package com.myapplication.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> compnyNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] names = new String[] {"Tesla","McDonalds","Burger King","Space X","Toyota","Honda","Audi","BMW"};

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        for (int i = 0; i<names.length; i++){
            compnyNames.add(names[i]);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this,compnyNames));

    }
}