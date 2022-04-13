package com.ninja.oop;

public class GrandFather {
    int cars = 2;
    int landInAcres = 12;

    public void grandFatherProperty(){
        System.out.println("Grand father's");
        System.out.println("Total cars of grand father : " + cars);
        System.out.println("Total acres of land of grand father : " + landInAcres);
        System.out.println("....................................");
    }
    public GrandFather(){
        System.out.println("Grand father constructor");
    }
}
class Father extends GrandFather {
    int house = 3;

    public void fatherProperty(){
        System.out.println("father's");
        System.out.println("Number of cars : " + cars);
        System.out.println("Number of acres of land : " + landInAcres);
        System.out.println("Number of houses : " + house);
        System.out.println("....................................");
    }
    public Father(){
        System.out.println("Father constructor");
    }
}
class Children extends Father {
    int scooter = 3;
    int cars = 3;
    public void childrenProperty(){
        System.out.println("Children's");
        System.out.println("Number of cars : " + (cars + (super.cars)));
        System.out.println("Number of acres of land : " + landInAcres);
        System.out.println("Number of houses : " + house);
        System.out.println("Number of scooters : " + scooter);
    }
    public Children(){
        System.out.println("Children constructor");
    }

    public static void main(String[] args) {
        Children ch = new Children();
        ch.grandFatherProperty();
        ch.fatherProperty();
        ch.childrenProperty();
    }
}

