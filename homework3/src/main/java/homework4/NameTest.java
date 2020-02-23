package main.java.homework4;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    Name nameTest;
    Person person1;
    Person person2;

    @Test
    public void test_name1_less_than_name2() {
        Comparator<Person> nameTest = new Name();
        Person person1 = new Person("John", 12);
        Person person2 = new Person("Maria", 15);
        assertEquals(-1,nameTest.compare(person1,person2));

    }

    @Test
    public void test_name2_less_than_name1() {
        Comparator<Person> nameTest = new Name();
        Person person1 = new Person("John", 18);
        Person person2 = new Person("Alan", 19);
        assertEquals(1,nameTest.compare(person1,person2));

    }

    @Test
    public void test_same_name() {
        Comparator<Person> nameTest = new Name();
        Person person1 = new Person("Maria", 18);
        Person person2 = new Person("Maria", 16);
        assertEquals(0,nameTest.compare(person1,person2));

    }

}