package com.ninja;

import java.util.Scanner;

public class Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the stack: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int top = -1;

        do{
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peak element");
            System.out.println("4. Display stack");
            System.out.println("5. Exit the program");
            switch (sc.nextInt()){
                case 1:
                    if(top > n){
                        System.out.println("Stack overflow");
                    }else{
                        System.out.print("Enter the element to push :");
                        int element = sc.nextInt();
                        arr[++top] = element;
                    }
                    break;
                case 2:
                    if(top == -1){
                        System.out.println("Stack underflow!");
                    }else{
                        top--;
                    }
                    break;
                case 3:
                    if(top == -1){
                        System.out.println("Stack is empty!");
                    }else{
                        System.out.println("Top element is : " + arr[top]);
                    }
                    break;
                case 4:
                    if(top == -1){
                        System.out.println("Stack is empty!");
                    }else{
                        for(int i = 0; i <= top; i++){
                            System.out.print(arr[i] + " -> ");
                        }
                        System.out.println("TOP\n");

                    }
                    break;
                case 5:
                    System.out.println("You terminated the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You selected invalid option!");
                    break;
            }
        }while(true);
    }
}
