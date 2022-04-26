package com.ninja.factory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mode of transportation");
        String transportMode = sc.nextLine();
        System.out.println("Enter number of people :");
        int noOfPeople = sc.nextInt();
        TransportPlan transportPlan = transportFactory.getTransport(transportMode);
        System.out.print("Bill amount for " + transportMode + " of " + noOfPeople + " people is : ");
        transportPlan.getRate();
        transportPlan.calculateRate(noOfPeople);
    }
}
