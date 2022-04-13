package com.ninja.oop;

public class Event {
    protected String name;
    protected String details;
    protected String type;
    protected String orgName;

    protected void display(){
        System.out.println("Event name is : " + this.name);
        System.out.println("Details : " + this.details);
        System.out.println("Type is : " + this.type);
        System.out.println("Organizer name is : " + this.orgName);
    }
}
class Exhibition extends Event {
    private int noOfStalls;

    Exhibition(String name,String details,String type,String orgName,int noOfStalls){
        this.name = name;
        this.details = details;
        this.type = type;
        this.orgName = orgName;
        this.noOfStalls = noOfStalls;
    }
    public void displayExhibition(){
        super.display();
        System.out.println("Number of stalls are : " + this.noOfStalls);

    }
}
class StageEvent extends Event {
    private int noOfSeats;
    StageEvent(String name,String details,String type,String orgName,int noOfSeats){
        this.name = name;
        this.details = details;
        this.type = type;
        this.orgName = orgName;
        this.noOfSeats = noOfSeats;
    }
    public void displayStage(){
        super.display();
        System.out.println("Number of seats are : " + noOfSeats);
    }
}
