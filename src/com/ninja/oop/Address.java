package com.ninja.oop;

public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pin;

    public Address(String addressLine1, String addressLine2, String city,
                   String state, Integer pin){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }


}
