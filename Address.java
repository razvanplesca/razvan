package org.example;

class Address {
    private final String country;

    Address(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return getCountry();
    }
}
