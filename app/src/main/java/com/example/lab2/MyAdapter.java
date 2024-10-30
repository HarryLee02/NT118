package com.example.lab2;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<FoodModel> foodModelList;

    // Constructor
    public MyAdapter(Context context, List<FoodModel> foodModelArrayList) {
        this.context = context;
        this.foodModelList = foodModelArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_item, parent, false);
        return new MyAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        FoodModel model = foodModelList.get(position);
        holder.img.setImageResource(model.getFoodImage());
        holder.name.setText(model.getFoodName());
        holder.price.setText(model.getFoodPrice());
        holder.price.setPaintFlags(holder.price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.discountPrice.setText(model.getFoodDiscountPrice());
        holder.rating.setRating(model.getFoodRating());

        holder.dishItem.setOnClickListener(view -> {
            // do something
            Toast.makeText(context, "You clicked on " + model.getFoodName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return foodModelList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView img;
        TextView name;
        TextView price;
        TextView discountPrice;
        RatingBar rating;
        ConstraintLayout dishItem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.foodImg);
            name = itemView.findViewById(R.id.foodName);
            price = itemView.findViewById(R.id.foodPrice);
            discountPrice = itemView.findViewById(R.id.foodDiscountPrice);
            rating = itemView.findViewById(R.id.foodRating);
            dishItem = itemView.findViewById(R.id.dishItem);
        }
    }
}
