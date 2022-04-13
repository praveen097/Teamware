package com.ninja.oop.day3;

import java.util.Scanner;

public abstract class Shape {
    public abstract double calculatePerimeter();
}
class Circle extends Shape {
    float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
class Rectangle extends Shape {
    float length;
    float breadth;

    public void setLength(float length,float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculatePerimeter() {
     return 2 * (length + breadth);
    }
}
class Square extends Shape {
    float side;

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of Shapes:\n" +
                "1.Circle\n" +
                "2.Rectangle\n" +
                "3.Square\n");
        System.out.print("Enter your choice:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Circle c = new Circle();
                System.out.print("Enter radius : ");
                c.setRadius(sc.nextFloat());
                System.out.printf("Perimeter is %.2f",c.calculatePerimeter());
                break;
            case 2:
                Rectangle r = new Rectangle();
                System.out.print("Enter length : ");
                float length = sc.nextFloat();
                System.out.print("Enter breadth : ");
                float breadth = sc.nextFloat();
                r.setLength(length,breadth);
                System.out.printf("Perimeter is %.2f",r.calculatePerimeter());
                break;
            case 3:
                Square s = new Square();
                System.out.print("Enter side : ");
                s.setSide(sc.nextInt());
                System.out.printf("Perimeter is %.2f",s.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}