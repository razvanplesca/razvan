package org.example.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SalesRepresentative salesRepresentative1 = new SalesRepresentative("SR1",10,500);
        SalesRepresentative salesRepresentative2 = new SalesRepresentative("SR2",7,800);
        SalesRepresentative salesRepresentative3 = new SalesRepresentative("SR3",3,1200);
        SalesRepresentative salesRepresentative4 = new SalesRepresentative("SR4",2500,4);
        SalesRepresentative[] representatives = {salesRepresentative1,salesRepresentative2,salesRepresentative3,salesRepresentative4};

        System.out.println(Arrays.toString(representatives));

        Bubblesort bubblesort = new Bubblesort();

        SalesRepresentative[] sortedRepresentatives = bubblesort.sort(representatives);

        System.out.println(Arrays.toString(sortedRepresentatives));

        for (SalesRepresentative representative : sortedRepresentatives) {
            System.out.println(representative);
        }

    }

}