package com.ninja.oop.day3;

interface Beast {
    public void displayBeast();
}
interface KGF {
    public void displayKGF();
}
class MovieTickets implements Beast, KGF{
    @Override
    public void displayBeast() {
        System.out.println("Tickets for Beast are available");
    }
    @Override
    public void displayKGF() {
        System.out.println("Tickets for KGF are available");
    }
}
public class Tickets {
    public static void main(String[] args) {
        MovieTickets mt = new MovieTickets();
        mt.displayBeast();
        mt.displayKGF();
    }
}
