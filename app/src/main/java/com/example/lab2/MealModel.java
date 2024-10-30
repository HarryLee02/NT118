package com.example.lab2;

public class MealModel {
    int foodImage;
    String foodName;
    String totalDish;
    String totalDiscount;

    public MealModel(int foodImage, String foodName, String totalDish, String totalDiscount) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.totalDish = totalDish;
        this.totalDiscount = totalDiscount;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getTotalDish() {
        return totalDish;
    }

    public void setTotalDish(String totalDish) {
        this.totalDish = totalDish;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

}
