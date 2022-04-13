package com.ninja.oop;

import java.util.Locale;
import java.util.Scanner;

public class EventDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the event :");
        String eventName = sc.nextLine();
        if(eventName.length() > 50){
            System.out.println("Event name cannot exceed length of 50");
            System.out.println("Please enter name again");
            eventName = sc.nextLine();
        }
        System.out.print("Enter the type of the event : ");
        String eventType = sc.nextLine();
        if(eventType.length() > 50){
            System.out.println("Event name cannot exceed length of 50");
            System.out.println("Please enter type again");
            eventType = sc.nextLine();
        }
        System.out.print("Enter the number of people expected : ");
        int peopleExpected = sc.nextInt();
        System.out.print("Is it a paid entry? (Type Y or N) : ");
        char entryType = sc.next().toUpperCase().charAt(0);
        if(entryType != 'Y' ||entryType != 'N'){
            System.out.println("Answer should be Y or N only!");
            System.out.print("Please enter type again : ");
            entryType = sc.next().toUpperCase().charAt(0);
        }
        System.out.print("Enter the projected expenses (in lakhs) for this event : ");
        double expenses = sc.nextDouble();

        System.out.println("Event name : " + eventName);
        System.out.println("Event type : " + eventType);
        System.out.println("Expected count  : " + peopleExpected);
        System.out.println("Paid Entry : " + entryType);
        System.out.printf("Projected Expense %.1f L  ", expenses);

    }
}
