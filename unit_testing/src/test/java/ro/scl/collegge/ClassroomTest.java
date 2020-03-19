package ro.scl.collegge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    Classroom classroom;

    @BeforeEach
    public void setUp() {
        classroom = new Classroom();
    }

    @Test
    public void test_add_same_student() {
        Student student = new Student("Maria", "Popescu", "123123123");
        Student student2 = new Student("Maria", "Popescu", "123123123");

        assertTrue(classroom.add(student));
        assertFalse(classroom.add(student2));

    }

    @Test
    public void add_same_cnp() {
        Student student = new Student("Maria", "Popescu", "123123123");
        Student student2 = new Student("Maria", "Constantinescu", "123123123");

        assertTrue(classroom.add(student));
        assertTrue(classroom.add(student2));
    }

    public void test_sort_by_last_name() {
        Student student = new Student("Maria", "Popescu", "1231313213");
        Student student2 = new Student("Maria", "Constantinescu", "12312312312312");
        classroom.add(student);
        classroom.add(student2);

        List<Student> result = new ArrayList<>(classroom.getStudentsOrderByLastName());

        Collection<Student> expected = new LinkedList<>();

        Student c_student = new Student("Maria", "Popescu", "1231313213");
        Student c_student2 = new Student("Maria", "Constantinescu", "12312312312312");


//        expected.add(c_student2);
//        expected.add(c_student);
//        assertEquals(expected, result);

        assertEquals(c_student2, result.get(0));
        assertEquals(c_student, result.get(1));
    }

//    @Test
//    public void test_contains_negative() {
//        Student student = new Student("Maria", "Popescu", "1");
//        classroom.add(student);
//        assertFalse(classroom.contains(new Student(("Gigi", "Bec ali", "1") ));
//    }
//
//    @Test
//    public void test_contains_postive() {
//        Student student = new Student("Maria", "Popescu", "1");
//        classroom.add(student);
//
//        assertTrue(classroom.contains(new Student("Maria", "Popescu", "1")));
//    }


}