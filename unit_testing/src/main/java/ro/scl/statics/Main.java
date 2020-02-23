package ro.scl.statics;

public class Main {
    public static void main(String[] args) {

        //Ha A-ban statikus a metodus: A, kulonben: B
        A a = new B();
        a.print(); //polymorphism
    }
}
