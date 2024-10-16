package com.example.lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private final ArrayList<FoodModel> foodModelArrayList;

    // Constructor
    public MyAdapter( ArrayList<FoodModel> courseModelArrayList) {
        this.foodModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        FoodModel model = foodModelArrayList.get(position);
        holder.img.setImageResource(model.getFoodImage());
        holder.name.setText(model.getFoodName());
        holder.price.setText(model.getFoodRating());
        holder.discountPrice.setText(model.getFoodDiscountPrice());
        holder.rating.setRating(model.getFoodRating());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return foodModelArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ShapeableImageView img;
        private final TextView name;
        private final TextView price;
        private final TextView discountPrice;
        private final RatingBar rating;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.foodImg);
            name = itemView.findViewById(R.id.foodName);
            price = itemView.findViewById(R.id.foodPrice);
            discountPrice = itemView.findViewById(R.id.foodDiscountPrice);
            rating = itemView.findViewById(R.id.foodRating);
        }
    }
}
