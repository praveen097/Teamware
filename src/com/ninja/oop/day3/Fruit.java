package com.ninja.oop.day3;

public class Fruit {
    public void taste() {
        System.out.println("All fruits are very tasty");
    }
}
class Mango extends Fruit {
    public void taste() {
        System.out.println("Mangoes are very tasty");
    }
}


class FruitsMain {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.taste();
        System.out.println("Hash code of F is : " + f.hashCode());
        Mango m = new Mango();
        m.taste();
        System.out.println("Hash code of M is : " + m.hashCode());
        Fruit fc = new Mango();
        fc.taste();
        System.out.println("HashCode : " + fc.hashCode());

        f = m;
        f.taste();
        System.out.println("Hash code of F is : " + f.hashCode());
        m = (Mango)f;
        m.taste();
    }
}
