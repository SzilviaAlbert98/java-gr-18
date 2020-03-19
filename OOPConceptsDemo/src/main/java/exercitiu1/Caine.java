package exercitiu1;

public class Caine extends Animal {
    public void bark(){
        System.out.println("Cainele latra");
    }

    //overload
    public void bark(int intensitate) {
        System.out.println("Cainele latra cu intensitatea " + intensitate);
    }
}
