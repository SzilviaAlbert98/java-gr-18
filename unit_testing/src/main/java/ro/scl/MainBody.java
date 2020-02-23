package ro.scl;

public class MainBody {
    public static void main(String[] args) {
        Body body = new Body(12,12);

        //nu pot sa creez inner class fara instanta
        //e mai puternica, decat nested class
        Body.Arm leftarm = body.new Arm();

        //pot sa fac ca o instanta a clasei, fiindca poate sa exista si singur
        Body.Glasses glasses = new Body.Glasses();
    }

    public void printArm(Body.Arm arm) {

    }
}
