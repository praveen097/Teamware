package com.ninja.oop.day3;

import java.util.Scanner;

public interface Stall {
    void display();
}
class GoldStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;

    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }
    @Override
    public void display(){
        System.out.println("Stall name is : " + this.stallName);
        System.out.println("Cost of the stall is : " + this.cost);
        System.out.println("Owner name is : " + this.ownerName);
        System.out.println("Number of tv sets : " + this.tvSet);
    }
}
class PremiumStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int projector;

    public PremiumStall(String stallName, int cost, String ownerName, int projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }
    @Override
    public void display(){
        System.out.println("Stall name is : " + this.stallName);
        System.out.println("Cost of the stall is : " + this.cost);
        System.out.println("Owner name is : " + this.ownerName);
        System.out.println("Number of projectors : " + this.projector);
    }
}
class ExecutiveStall  implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int screen;

    public ExecutiveStall (String stallName, int cost, String ownerName, int screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }
    @Override
    public void display(){
        System.out.println("Stall name is : " + this.stallName);
        System.out.println("Cost of the stall is : " + this.cost);
        System.out.println("Owner name is : " + this.ownerName);
        System.out.println("Number of screen are : " + this.screen);
    }
}
class StallMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ChooseStall Type\n" +
                "1)Gold Stall\n" +
                "2)Premium Stall\n" +
                "3)Executive Stall\n");
        System.out.print("Please enter your choice : ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost," +
                        "Owner Name,Number of TV ");
                sc.nextLine();
                String[] gold = sc.nextLine().split(",");
                GoldStall gs = new GoldStall(gold[0],Integer.parseInt(gold[1]),
                        gold[2],Integer.parseInt(gold[3]));
                gs.display();
                break;
            case 2:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost," +
                        "Owner Name,Number of projector ");
                sc.nextLine();
                String[] premium = sc.nextLine().split(",");
                PremiumStall p = new PremiumStall(premium[0],Integer.parseInt(premium[1]),
                        premium[2],Integer.parseInt(premium[3]));
                p.display();
                break;
            case 3:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost," +
                        "Owner Name,Number of screens ");
                sc.nextLine();
                String[] executive = sc.nextLine().split(",");
                ExecutiveStall e = new ExecutiveStall(executive[0],Integer.parseInt(executive[1]),
                        executive[2],Integer.parseInt(executive[3]));
                e.display();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}