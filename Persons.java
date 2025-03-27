package org.example;

import java.util.*;

class Persons {
    final Person person1 = new Person("Razvan", 42);
    final Person person2 = new Person("Tunde", 34);
    final Person person3 = new Person("George", 47);
    final Person person4 = new Person("Karina", 5);

    final Hobby hobby1 = new Hobby("Cycling", Arrays.asList(new Address("Japan"), new Address("Thailand")));
    final Hobby hobby2 = new Hobby("Swimming", Arrays.asList(new Address("Romania"), new Address("Hungary"), new Address("Bulgaria")));
    final Hobby hobby3 = new Hobby("Hiking", Arrays.asList(new Address("Tibet"), new Address("France"), new Address("Russia"), new Address("Kenya")));
    final Hobby hobby4 = new Hobby("Reading", Arrays.asList(new Address("England"), new Address("Scotland"), new Address("Ireland")));

    Map<Person, List<Hobby>> personHobbies = new HashMap<>();

    void getHobbies(Person person) {
        personHobbies.put(person1, Arrays.asList(hobby1, hobby2, hobby3));
        personHobbies.put(person2, Collections.singletonList(hobby2));
        personHobbies.put(person3, Arrays.asList(hobby3, hobby4));
        personHobbies.put(person4, Arrays.asList(hobby1, hobby2, hobby3, hobby4));
        System.out.println(person.getName() + " has this hobbies : " + personHobbies.get(person));
    }

    void scannerCheck() {
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un nume: ");
        String inputName = scanner.nextLine();
        for (Person person : personList) {
            if (person.getName().equals(inputName)) {
                System.out.println(person.getName() + " hobbies are: " + personHobbies.get(person));
                break;
            }
        }
    }

    void iterateByAge() {
        Set<Person> personSortedByAge = new TreeSet<>(new PersonByAgeComparator());
        personSortedByAge.add(person1);
        personSortedByAge.add(person2);
        personSortedByAge.add(person3);
        personSortedByAge.add(person4);

        System.out.println("Persons sorted by age: ");
        for (Person person : personSortedByAge) {
            System.out.println(person);
        }
    }

    void iterateByName() {
        Set<Person> personSortedByName = new TreeSet<>(new PersonByNameComparator());
        personSortedByName.add(person1);
        personSortedByName.add(person2);
        personSortedByName.add(person3);
        personSortedByName.add(person4);

        System.out.println("Persons sorted by name: ");
        for (Person person : personSortedByName) {
            System.out.println(person);

        }
    }
}
