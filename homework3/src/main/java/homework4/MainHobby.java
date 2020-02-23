package main.java.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainHobby {
    public static void main(String[] args) {
        PracticeHobby r = new PracticeHobby();

        System.out.println("The first person with his hobbies: ");
        r.put(new Person("Alin Tudor", 15), Arrays.asList(
                new Hobby("Football", 2, Arrays.asList(new Adress("Cluj", "Aleea Stadionului", "2"),
                        new Adress("Cluj", "Drumul Sfântul Ioan", "3"))),
                new Hobby("Dance", 1, Arrays.asList(new Adress("Cluj", "Strada Someșului", "5"),
                        new Adress("Cluj", "Regele Ferdinand", "22")))));
        r.print();
        System.out.println();

        //adding an existing  Person with the same properties
        System.out.println("Adding an existing  Person with the same properties: ");
        r.put(new Person("Alin Tudor", 15), Arrays.asList(
                new Hobby("Football", 2, Arrays.asList(new Adress("Cluj", "Aleea Stadionului", "2"),
                        new Adress("Cluj", "Drumul Sfântul Ioan", "3"))),
                new Hobby("Dance", 1, Arrays.asList(new Adress("Cluj", "Strada Someșului", "5"),
                        new Adress("Cluj", "Regele Ferdinand", "22")))));
        r.print();
        System.out.println();

        //adding a Person with an existing Name, but with a different age
        System.out.println("Adding a Person with an existing name, but with a different age: ");
        r.put(new Person("Alin Tudor", 14), Arrays.asList(
                new Hobby("Football", 2, Arrays.asList(new Adress("Cluj", "Aleea Stadionului", "2"),
                        new Adress("Cluj", "Drumul Sfântul Ioan", "3"))),
                new Hobby("Dance", 1, Arrays.asList(new Adress("Cluj", "Strada Someșului", "5"),
                        new Adress("Cluj", "Regele Ferdinand", "22")))));
        r.print();
        System.out.println();

        //adding to an existing Person a new Hobby
        System.out.println("Adding a new hobby to an existing Person: ");
        r.put(new Person("Alin Tudor", 15), Arrays.asList(
                new Hobby("Football", 2, Arrays.asList(new Adress("Cluj", "Aleea Stadionului", "2"),
                        new Adress("Cluj", "Drumul Sfântul Ioan", "3"))),
                new Hobby("Swimming", 3, Arrays.asList(new Adress("Cluj", "Pandurilor", "7"))),
                new Hobby("Dance", 1, Arrays.asList(new Adress("Cluj", "Strada Someșului", "5"),
                        new Adress("Cluj", "Regele Ferdinand", "22")))));
        r.print();
        System.out.println();

        //adding a new Person
        System.out.println("Adding a new Person: ");
        r.put(new Person("Maria Popescu", 21), Arrays.asList(new Hobby("Singing", 1,
                Arrays.asList(new Adress("Cluj", "Aurel Suciu", "55")))));
        r.print();
        System.out.println();

    }

}
