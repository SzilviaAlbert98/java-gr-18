package main.java.homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hobby {
    private String hobbyName;
    int frequency;
    List<Adress> address = new ArrayList<>();

    public Hobby(String hobbyName, int frequency, List<Adress> address) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.address = address;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Adress> getAddress() {
        return address;
    }

    public void setAddress(List<Adress> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(hobbyName, hobby.hobbyName) &&
                Objects.equals(address, hobby.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyName, frequency, address);
    }
}
