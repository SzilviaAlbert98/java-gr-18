package main.java.homework4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeHobby {
    HashMap<Person , List<Hobby>> relation = new HashMap<>();

    public HashMap<Person, List<Hobby>> getRelation() {
        return relation;
    }

    public void setRelation(HashMap<Person, List<Hobby>> relation) {
        this.relation = relation;
    }

    public void put (Person person, List<Hobby> list) {
         relation.put(person,list);
    }

    public boolean containsPerson (Person person) {
        boolean has = false;

        for (Person element : relation.keySet()) {
            if (element.equals(person)) has = true;
        }
        return false;
    }


    public void print () {
        for (Person name: relation.keySet()){
                String key = name.toString();
                String value = relation.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

}
