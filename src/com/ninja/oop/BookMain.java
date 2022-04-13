package com.ninja.oop;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter book ID: ");
        book.setBookId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter book name : ");
        book.setBookName(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter author name : ");
        book.setBookAuthor(sc.nextLine());
        System.out.println("Enter price of the book : ");
        book.setCost(sc.nextDouble());

        System.out.println("Book ID : " + book.getBookId());
        System.out.println("Book name : " + book.getBookName());
        System.out.println("Book author : " + book.getBookAuthor());
        System.out.println("Book cost : " + book.isCost());
    }
}
