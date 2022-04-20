package com.ninja.oop.generics;

public class GenericsClass<T> {
    public T number;

    public  GenericsClass(T number){
        this.number = number;
        this.getData();
    }

    public void getData(){
        System.out.println(number);
    }

}


class Main {
    public static void main(String[] args) {
        GenericsClass gc = new GenericsClass("Hello");
        GenericsClass gc1 = new GenericsClass(123);
        GenericsClass gc2 = new GenericsClass(76.90);
    }
}
