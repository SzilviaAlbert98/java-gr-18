package exercitiu;

public class Spider extends Animal {
    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating");
    }

    @Override
    public void setName(String name) {

    }
}
