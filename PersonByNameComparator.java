package org.example;

import java.util.Comparator;

class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(final Person person1,final Person person2) {
        String firstPersonName = person1.getName();
        String secondPersonName = person2.getName();
        return firstPersonName.compareTo(secondPersonName);
    }
}
