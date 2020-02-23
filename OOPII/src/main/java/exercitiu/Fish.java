package exercitiu;

public class Fish extends Animal implements Pet {

    private String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("fish is eating");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish with name: " + this.name + "is playing");
    }
}
