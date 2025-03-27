package org.example;

import java.util.List;

class Hobby {
    private final String hobbyName;
    private int frequency;
    private final List<Address> addresses;


    public Hobby(String hobbyName, List<Address> addresses) {
        this.hobbyName = hobbyName;
        this.addresses = addresses;
    }


    public String getHobbyName() {
        return hobbyName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return  getHobbyName() + ", places to practice " + getAddresses();
    }
}
