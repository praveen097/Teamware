package com.ninja.oop.collection.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        User user1 = new User("Praveen","541654541","praveen097","haha@gmail.com");
        list.add(user1);
        User user2 = new User("Rahul","87969687","rahul69","hoho@gmail.com");
        list.add(user2);
        User user3 = new User("Ravi","876787676","ravi454","hehe@gmail.com");
        list.add(user3);
        User user4 = new User("Harsha","5727285","harsha85","huhu@gmail.com");
        list.add(user4);
        System.out.println("Enter the number of user details need to be added :");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            User newUser = new User();
            System.out.println("Enter the details of user " + i + " :");
            String[] values = sc.nextLine().split(",");

            newUser.setUserName(values[0]);
            newUser.setContactNumber(values[1]);
            newUser.setUserName(values[2]);
            newUser.setEmail(values[3]);
            list.add(newUser);
        }
        System.out.println("Current details are : ");
        System.out.format("%-15s %-15s %-15s %s\n","Name","Contact Number","Username","Email");
        for (User e : list){
            System.out.format("%-15s %-15s %-15s %s\n",e.getName(),e.getContactNumber(),
                    e.getUserName(),e.getEmail());
        }
        System.out.print("Enter the range you want to delete :\nFrom : ");
        int from = sc.nextInt();
        System.out.print("To : ");
        int to = sc.nextInt();
        for (int i = from; i < to; i++) {
            list.remove(from);
        }
        System.out.println("Details after removing some range are : ");
        System.out.format("%-15s %-15s %-15s %s\n","Name","Contact Number","Username","Email");
        for (User e : list){
            System.out.format("%-15s %-15s %-15s %s\n",e.getName(),e.getContactNumber(),
                    e.getUserName(),e.getEmail());
        }
    }


}
