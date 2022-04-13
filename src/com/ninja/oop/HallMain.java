package com.ninja.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HallMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter the details of Hall 1 : ");
        System.out.println("Hall Name :");
        String hall1 = sc.nextLine();
        System.out.println("Contact Number :");
        long mobile1 = sc.nextLong();
        System.out.println("Cost Per Day :");
        double cost1 = sc.nextDouble();
        System.out.println("Owner Name :");
        sc.nextLine();
        String owner1 = sc.nextLine();
        System.out.println("Booking Date(dd-mm-yyyy) :");
        Date date1 = sdf.parse(sc.nextLine());

        Hall hall = new Hall(hall1,mobile1,cost1,owner1,date1);
        System.out.println("Enter the details of Hall 2 : ");
        System.out.println("Hall Name :");
        String hall2 = sc.nextLine();
        System.out.println("Contact Number :");
        long mobile2 = sc.nextLong();
        System.out.println("Cost Per Day :");
        double cost2 = sc.nextDouble();
        System.out.println("Owner Name :");
        sc.nextLine();
        String owner2 = sc.nextLine();
        System.out.println("Booking Date(dd-mm-yyyy) :");
        Date date2 = sdf.parse(sc.nextLine());

        Hall hallSecond = new Hall(hall2,mobile2,cost2,owner2,date2);

        if(hall.name.equals(hallSecond.name)){
            if(hall.date.equals(hallSecond.date)){
                System.out.println("Dates and halls are same, can't be booked.Try again with different dates");
            }
        }else{
            System.out.println("Halls and dates are different, can be booked!");
        }


    }
}
