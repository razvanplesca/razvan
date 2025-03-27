package org.example;

import java.util.Comparator;

class PersonByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(final Person person1, final Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
