package com.ninja.prototype;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        FoodShop f1 = new FoodShop();
        f1.setShopName("Fortune");
        f1.loadAllFoods();

        FoodShop f2 = (FoodShop) f1.clone();
        f2.setShopName("Taj");

        f1.getFoodList().remove(1);
        System.out.println(f1);
        System.out.println(f2);
    }
}
