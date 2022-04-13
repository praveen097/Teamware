package com.ninja.oop.day3;

public abstract class Hotel {
    public abstract void setBiryaniPrice();

}
class Paradise extends Hotel {

    @Override
    public void setBiryaniPrice() {
        int chickenBiryani = 199;
        int muttonBiryani = 299;
        System.out.format("%-20s %-20s\n","Chicken Biryani","Mutton Biryani");
        System.out.format("%-20s  %-20s\n",chickenBiryani + " Rs/-",muttonBiryani + " Rs/-");

    }
}
class Taj extends Hotel {

    @Override
    public void setBiryaniPrice() {
        int chickenBiryani = 399;
        int muttonBiryani = 499;
        System.out.format("%-20s %-20s\n","Chicken Biryani","Mutton Biryani");
        System.out.format("%-20s %-20s\n",chickenBiryani + " Rs/-",muttonBiryani + " Rs/-");

    }
}
class Fortune extends Hotel {

    @Override
    public void setBiryaniPrice() {
        int chickenBiryani = 299;
        int muttonBiryani = 399;
        System.out.format("%-20s %-20s\n","Chicken Biryani","Mutton Biryani");
        System.out.format("%-20s %-20s\n",chickenBiryani + " Rs/-",muttonBiryani + " Rs/-");

    }
}
class Main {
    public static void main(String[] args) {
        Taj taj = new Taj();
        taj.setBiryaniPrice();
    }
}
