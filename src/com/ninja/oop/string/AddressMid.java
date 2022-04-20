package com.ninja.oop.string;

import java.util.ArrayList;
import java.util.List;

public class AddressMid {
    ArrayList<Address> list = new ArrayList<>();

    public void setAddress(String s) {
        String[] values = s.split(",");
        Address address = new Address();
        address.setUserId(Integer.parseInt(values[0]));
        address.setStreet(values[1]);
        address.setCity(values[2]);
        address.setState(values[3]);
        list.add(address);
    }

    public List<Address> getDetails() {
        return list;
    }
}
