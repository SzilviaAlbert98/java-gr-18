package ro.scl.collegge;

import java.util.*;

public class Classroom {
    private Collection<Student> students = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCnp().compareTo(o2.getCnp());
        }
    });

    public boolean add(Student student) {
        return students.add(student);
    }

    public Collection<Student> getStudentsOrderByLastName() {
        //fac o copiere sa nu modific lisrta originala
        List<Student> result = new ArrayList<>();

        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return result;
    }

}
