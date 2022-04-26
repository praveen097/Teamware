package com.ninja.factory;

public class TransportFactory {
    public TransportPlan getTransport(String mode){
        if(mode.equalsIgnoreCase("Bus")){
            return new Bus();
        }else if(mode.equalsIgnoreCase("Car")){
            return new Car();
        }else if(mode.equalsIgnoreCase("Train")){
            return new Train();
        }else{
            return null;
        }
    }
}
