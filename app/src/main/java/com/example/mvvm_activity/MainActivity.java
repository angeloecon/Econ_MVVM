package com.example.mvvm_activity;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
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

        List<PartsModel> parts = new ArrayList<>();

        parts.add(new PartsModel("CPU", "Ryzen 9 9950x3D", R.drawable.r9));
        parts.add(new PartsModel("MotherBoard", "Asus ROG", R.drawable.asusmobo));
        parts.add(new PartsModel("RAM", "Trident-Z DDR5 2x16gb", R.drawable.ddr5));
        parts.add(new PartsModel("GPU", "RTX 5090", R.drawable.rtx5090));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PartsAdapter(getApplicationContext(), parts));
    }

}