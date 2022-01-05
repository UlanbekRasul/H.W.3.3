package com.example.hw33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> names = new ArrayList<>();
    private itemAdapter adapter;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.textView);
        LoadData();
        adapter = new itemAdapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void LoadData() {

        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
    }
}