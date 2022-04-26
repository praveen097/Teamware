package com.ninja.factory;

public abstract class TransportPlan {
    protected double rate;
    abstract void getRate();

    public void calculateRate(int noOfPeople){
        System.out.println(noOfPeople * rate);
    }
}
