package com.ninja.oop.day3;

public interface Food {
    int foodId = 123;
//    varibles declared in interface are final and cannot be changed
    void display();
//    Even if we don't provide abstract keyword to the method, it will be considered as
//    abstract method only, JVM does all these in the back while compiling
}
class VegBiryani implements Food {

    @Override
    public void display() {
        System.out.println("Price of Veg Biryani is 149.00\nFood id is : " + foodId);
    }
}
class NonVegBiryani implements Food {

    @Override
    public void display() {
        System.out.println("Price of Veg Biryani is 229.00\nFood id is : " + foodId);
    }

    public static void main(String[] args) {
        NonVegBiryani nvb  = new NonVegBiryani();
        nvb.display();
    }
}
