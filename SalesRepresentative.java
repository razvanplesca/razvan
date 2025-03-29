package org.example.Sort;

public class SalesRepresentative extends Bubblesort {
    String name;
    int sales;
    int quota;
    int revenue;

    SalesRepresentative(String name,int sales, int quota){
        this.name = name;
        this.sales =   sales;
        this.quota = quota;
    }

    public int getRevenue() {
        return sales * quota;
    }

    @Override
    public String toString() {
        return  name + " revenue: " + getRevenue();
    }

    @Override
    SalesRepresentative[] sort(SalesRepresentative[] arr) {
        return super.sort(arr);
    }
}
