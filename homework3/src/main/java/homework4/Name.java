package main.java.homework4;

import java.util.Comparator;

public class Name implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) return -1;
        else if (o1.getName().compareTo(o2.getName()) >0) return 1;
        else return 0;
    }
}
