public class MainLight {
    public static void main(String[] args) {
        System.out.println("Becul 2: ");

        Light bec1 = new Light(5);

        bec1.on();
        bec1.of();
        bec1.dimen();
        bec1.brighten();

        System.out.println("Becul 2: ");

        Light bec2 = new Light(20);

        bec2.brighten();
        bec2.brighten();
        bec2.dimen();
    }
}
