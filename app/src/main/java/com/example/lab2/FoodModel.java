package com.example.lab2;

public class FoodModel {
    int foodImage;
    String foodName;
    String foodPrice;
    String foodDiscountPrice;
    int foodRating;

    public FoodModel(int foodImage, String foodName, String foodPrice,String foodDiscountPrice, int foodRating) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodDiscountPrice = foodDiscountPrice;
        this.foodRating = foodRating;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodDiscountPrice() {
        return foodDiscountPrice;
    }

    public void setFoodDiscountPrice(String foodDiscountPrice) {
        this.foodDiscountPrice = foodDiscountPrice;
    }
    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public int getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(int foodRating) {
        this.foodRating = foodRating;
    }
}
