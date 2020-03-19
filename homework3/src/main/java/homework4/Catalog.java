package main.java.homework4;

import java.util.*;

public class Catalog {

    private TreeSet<Person> personsByName = new TreeSet<Person>(new Name());
    private TreeSet<Person> personsByAge = new TreeSet<>(new Age());


    public boolean add(Person person) {
        add2(person);
        return personsByName.add(person);
    }

    public boolean add2(Person person) {
        return personsByAge.add(person);
    }
    
    public void printByName() {
        for (Person element : personsByName) {
            System.out.println("Name: " + element.getName() + ", age: " + element.getAge());
        }
    }

    public void printByAge() {
        for (Person element : personsByAge) {
            System.out.println("Name: " + element.getName() + ", age: " + element.getAge());
        }
    }

}

