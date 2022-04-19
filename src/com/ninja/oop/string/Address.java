package com.ninja.oop.string;

import java.util.Scanner;

public class Address {
    private int userId;
    private String street;
    private String city;
    private String state;

    public void setValues(String arr){
        String[] str = arr.split(",");
        this.userId = Integer.parseInt(str[0]);
        this.street = str[1];
        this.city = str[2];
        this.state = str[4];
    }

}


