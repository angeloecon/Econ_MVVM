package com.example.mvvm_activity;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PartsViewModel partsViewModel = new ViewModelProvider(this).get(PartsViewModel.class);

        partsViewModel.getParts().observe(this, new Observer<List<PartsModel>>() {
            @Override
            public void onChanged(List<PartsModel> parts) {
                PartsAdapter adapter = new PartsAdapter(parts);
                recyclerView.setAdapter(adapter);
            }
        });
    }
}