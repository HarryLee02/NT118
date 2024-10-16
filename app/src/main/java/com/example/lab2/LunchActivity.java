package com.example.lab2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LunchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<FoodModel> foodModelArrayList = new ArrayList<>();
        foodModelArrayList.add(new FoodModel(R.drawable.pic_suon_nuong, "Burger", "10", "8", 4));
        foodModelArrayList.add(new FoodModel(R.drawable.pic_suon_nuong, "Pizza", "20", "15", 3));


        RecyclerView recyclerView = findViewById(R.id.recyclerItem);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//        MyAdapter myAdapter = new MyAdapter(foodModelArrayList);
//        recyclerView.setAdapter(myAdapter);

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lunch);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
}
