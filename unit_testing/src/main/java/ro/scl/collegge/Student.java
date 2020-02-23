package ro.scl.collegge;

import java.util.Objects;

public class Student {

    private String firstName;

    private String lastName;

    private String cnp;

    public Student(String firstName, String lastName, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(cnp, student.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, cnp);
    }
}
