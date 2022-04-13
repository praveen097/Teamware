package com.ninja.oop;

import java.util.Date;

public class Hall {
    public String name;
    private long telephone;
    private double costPerDay;
    private String ownerName;
    public Date date = new Date();



    public Hall(String eventName, long mobile, double cost, String owner, Date date){
        this.name = eventName;
        this.telephone = mobile;
        this.costPerDay = cost;
        this.ownerName = owner;
        this.date = date;
    }
}
