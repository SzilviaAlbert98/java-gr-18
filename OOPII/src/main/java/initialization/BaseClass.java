package initialization;

public class BaseClass {
    private int variabila = 100;
    protected int suma;

    static {
        System.out.println("baseClass static initialization block");
    }

    {
        System.out.println("baseClass regular initialization block");
        variabila = 100;
    }

    public BaseClass() {
        System.out.println("constructor in baseClass init");
        this.variabila = 100;
    }

    public BaseClass(int variabila){
        this.variabila = variabila;
    }
    public String  displaySomeInitData(){
        variabila = 2000;
        suma += 2000;
        System.out.println("displaySomeInitData");
        return "displayData";
    }
}
