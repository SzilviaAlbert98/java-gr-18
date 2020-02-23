package ro.scl;

public class Body {

    int weight;
    int height;

    Arm left;

    Arm right;

    Glasses glasses;

    public Body(int weight, int height) {
        this.weight = weight;
        this.height = height;

//        left = new Arm();
//        right = new Arm();

    }

    //inner clasa, in care e definita outer clasa, si outerul va fi obiiect, nu clasa
    //am acces la tot ce am in outer class
    //pentru organizare mai bine
    //legat de parinte
    //nu poti sa adresezi direct fara outer class dintr- o alta clasa
    class Arm {
        boolean tattos;

        public void setTattos(boolean tattos) {
            this.tattos = tattos;
        }

        public boolean isTattos() {
            return tattos;
        }

        //am acces la weigth, fiindca nu pot sa exist fara outer
        public void print() {
            System.out.println(weight);
        }
    }


    //nested clasa
    //nu sa am nimic acces din outer
    static class Glasses {
        int color;
//        nu pot sa fac asta fiindca nu am acces la outer
//        public void print() {
//            System.out.println(weight);
//        }
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Arm getLeft() {
        return left;
    }

    public Arm getRight() {
        return right;
    }

    public void setLeft(Arm left) {
        this.left = left;
    }

    public void setRight(Arm right) {
        this.right = right;
    }
}
