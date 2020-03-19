package exercitiu;

public class Cat extends Animal implements Pet{
    private String name;

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
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
        System.out.println("cat is playing");
    }
}
