package com.ninja.oop;

import java.util.Scanner;

public class Shape {
    protected double area;

}
class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea(){
        this.area = Math.PI * this.radius * this.radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public void setLength(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void computeArea(){
        area =  length * breadth;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public void setBase(double base,double height) {
        this.base = base;
        this.height = height;
    }


    public void computeArea(){
        area =  0.5 * base * height;
    }
}
class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape\n" +
                "1.Circle\n" +
                "2.Rectangle\n" +
                "3.Triangle\n");

        System.out.println("Select the option above : ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                Circle c = new Circle();
                System.out.println("Enter radius : ");
                c.setRadius(sc.nextDouble());
                c.computeArea();
                System.out.println("Area of circle is : " +c.area);
                break;
            case 2:
                Rectangle r = new Rectangle();
                System.out.println("Enter length : ");
                int length = sc.nextInt();
                System.out.println("Enter breadth : ");
                int breadth = sc.nextInt();

                r.setLength(length,breadth);
                r.computeArea();
                System.out.println("Area of rectangles is : " + r.area);
                break;
            case 3:
                Triangle t = new Triangle();
                System.out.println("Enter base : ");
                int base = sc.nextInt();
                System.out.println("Enter height : ");
                int height = sc.nextInt();

                t.setBase(base,height);
                t.computeArea();
                System.out.println("Area of rectangles is : " + t.area);
                break;
            default:
                System.out.println("Invalid ");
                break;
        }
    }
}
