package com.example.lab2;

import android.content.Context;
import android.content.Intent;
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

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MyMenuViewHolder> {
    Context context;
    List<MealModel> menuModelList;

    // Constructor
    public MealAdapter(Context context, List<MealModel> menuModelArrayList) {
        this.context = context;
        this.menuModelList = menuModelArrayList;
    }

    @NonNull
    @Override
    public MealAdapter.MyMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_menu_item, parent, false);
        return new MealAdapter.MyMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MealAdapter.MyMenuViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        MealModel model = menuModelList.get(position);
        holder.img.setImageResource(model.getFoodImage());
        holder.name.setText(model.getFoodName());
        holder.dish.setText(model.getTotalDish());
        holder.discount.setText(model.getTotalDiscount());

        holder.menuItem.setOnClickListener(view -> {
            // do something
            Intent intent = new Intent(context, LunchActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);


            Toast.makeText(context, "You clicked on " + model.getFoodName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return menuModelList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class MyMenuViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView img;
        TextView name;
        TextView dish;
        TextView discount;
        ConstraintLayout menuItem;


        public MyMenuViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.menuImg);
            name = itemView.findViewById(R.id.menuName);
            dish = itemView.findViewById(R.id.totalDish);
            discount = itemView.findViewById(R.id.totalDiscount);
            menuItem = itemView.findViewById(R.id.menuItem);
        }
    }
}
