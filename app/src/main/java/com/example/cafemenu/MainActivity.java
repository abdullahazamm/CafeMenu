package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<MenuModel> menuModelArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView= findViewById(R.id.recyclermenu);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuModel model=new MenuModel(R.drawable.karahi,"Chicken Karahi",2000);


        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Chicken Karahi",2000));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Daal Makhni",1000));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Daal Mash",500));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Chicken BBQ",2000));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Seekh Kabab",1200));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Saag",1000));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Rajhistani Handi",2200));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Malai Boti",1300));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"BBQ Platter",2200));
        menuModelArrayList.add(new MenuModel(R.drawable.karahi,"Desi Ghee Daal Makhni",900));

        RecyclerAdapter adapter=new RecyclerAdapter(this,menuModelArrayList);
        recyclerView.setAdapter(adapter);

    }
}