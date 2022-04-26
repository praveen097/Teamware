package com.ninja.prototype;

import java.util.ArrayList;
import java.util.List;

public class FoodShop implements Cloneable{
    private String shopName;
    List<Food> foodList = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
    public void loadAllFoods () {
        for (int i = 1; i <= 10; i++) {
            Food f = new Food();
            f.setFoodId(i);
            f.setFoodName("Food " + i);
            this.getFoodList().add(f);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FoodShop fs = new FoodShop();
        for (Food f: this.getFoodList()){
            fs.getFoodList().add(f);
        }
        return fs;
    }

    @Override
    public String toString() {
        return "FoodShop{" +
                "shopName=" + shopName +
                ", foodList='" + foodList + '\'' +
                '}';
    }
}
