public class Person {
    //public static final double PI = 3.14;

    String name; //attribute or instance variable
    int age = 0;

    //constructor impicit
    public Person(){
        System.out.println("Constructorul implicit a fost apelat.");
        this.name = "no name";
    }

    //constructor explicit
    public Person(String name){
        System.out.println("Constructorul explicit cu un parametrua fost apelat.");
        this.name = name;

    }



}
