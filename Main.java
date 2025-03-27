package org.example;

public class Main {
    public static void main(String[] args) {
        Persons persons = new Persons();

        persons.iterateByAge();
        persons.iterateByName();

        persons.getHobbies(persons.person1);

        persons.scannerCheck();//Razvan, Tunde, Karina, George
    }
}