package main.java.homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {
    Age ageTest;
    Person person1;
    Person person2;

   @Test
    public void test_age1_less_than_age2() {
       Comparator<Person> ageTest = new Age();
       Person person1 = new Person("John", 12);
       Person person2 = new Person("Maria", 15);
       assertEquals(-1,ageTest.compare(person1,person2));

   }

   @Test
    public void test_age2_less_than_age1() {
       Comparator<Person> ageTest = new Age();
       Person person1 = new Person("John", 18);
       Person person2 = new Person("Maria", 15);
       assertEquals(1,ageTest.compare(person1,person2));

   }

   @Test
    public void test_same_age() {
       Comparator<Person> ageTest = new Age();
       Person person1 = new Person("John", 18);
       Person person2 = new Person("Maria", 18);
       assertEquals(0,ageTest.compare(person1,person2));

   }




}