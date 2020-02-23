package main.java.homework4;

public class MainCatalog {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Person("Maria",21));
        catalog.add(new Person("Mariana",21));
        catalog.add(new Person("Mariana",21));
        catalog.add(new Person("Ion",21));
        catalog.add(new Person("Ion",22));

        System.out.println("Your catalog sorted by name: ");
        catalog.printByName();
        System.out.println();
        System.out.println("Your catalog sorted by age: ");
        catalog.printByAge();
    }

}
