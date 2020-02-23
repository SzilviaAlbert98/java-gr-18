package exercitiu;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("walks with number of legs:  " + this.legs);
    }


    public abstract void setName(String name);
}
