package com.ninja;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int front = 0;
        int rear = -1;
        do {
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Display stack");
            System.out.println("4. Exit the program");
            switch (sc.nextInt()) {
                case 1:
                    if(rear >= arr.length - 1){
                        System.out.println("Queue is full!");
                    }else {
                        System.out.print("Enter a number to add to the stack : ");
                        int element = sc.nextInt();
                        arr[++rear] = element;
                    }
                    break;
                case 2:
                    if(rear == -1){
                        System.out.println("Queue is empty");
                    }else{
                        for (int i = 1; i <= rear; i++) {
                            arr[i - 1] = arr[i];
                        }
                        rear--;
                    }
                    break;
                case 3:

                        System.out.print("START -> ");
                        for (int i = front ; i <= rear; i++) {
                            System.out.print(arr[i] + " -> ");
                        }
                        System.out.println("END");

                    break;
                case 4:
                    System.out.println("You terminated the program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option selected!");
                    break;
            }
        }while(true);

    }
}
