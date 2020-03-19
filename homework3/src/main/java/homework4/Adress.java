package main.java.homework4;

import java.util.Objects;

public class Adress {
    String city;
    String street;
    String number;

    public Adress(String city, String street, String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(city, adress.city) &&
                Objects.equals(street, adress.street) &&
                Objects.equals(number, adress.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, number);
    }
}
