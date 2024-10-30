package com.example.lab2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LunchActivity extends AppCompatActivity {
    List<FoodModel> foodModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lunch);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        this.overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        foodModelList = new ArrayList<FoodModel>();

        foodModelList.add(new FoodModel(R.drawable.pic_suon_nuong, "Suon nướng", "10000đ", "8000đ", 4));
        foodModelList.add(new FoodModel(R.drawable.pic_thit_kho_trung, "Thịt kho trứng", "20000đ", "15000đ", 3));
        foodModelList.add(new FoodModel(R.drawable.pic_pizza, "Pizza", "10000đ", "8000đ", 4));
        foodModelList.add(new FoodModel(R.drawable.pic_suon_nuong, "Pizza", "10000đ", "8000đ", 4));
        foodModelList.add(new FoodModel(R.drawable.pic_suon_nuong, "Pizza", "10000đ", "8000đ", 4));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, foodModelList));
    }
}
