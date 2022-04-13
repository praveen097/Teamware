package com.ninja.oop;

import java.util.Scanner;

public class EventMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Event type\n1.Exhibition\n2.StageEvent\n");
        System.out.print("Enter your choice :");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Account details in comma separated(Event Name,Details," +
                        "Type,Organiser  Name,Number of stalls)\n");
                sc.nextLine();
                String[] values = sc.nextLine().split(",");
                Exhibition sa = new Exhibition(values[0],values[1],values[2],values[3],Integer.parseInt(values[4]) );
                sa.displayExhibition();
                break;
            case 2:
                System.out.println("Enter Account details in comma separated(Event Name,Details," +
                        "Type,Organiser  Name,Number of seats)\n");
                sc.nextLine();
                String[] values1 = sc.nextLine().split(",");
                StageEvent ca = new StageEvent(values1[0],values1[1],values1[2],values1[3],Integer.parseInt(values1[4]) );
                ca.displayStage();
                break;
            default:
                System.out.println("Invalid!");
                break;
        }

    }
}
