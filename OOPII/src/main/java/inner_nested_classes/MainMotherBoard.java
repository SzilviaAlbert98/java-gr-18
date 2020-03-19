package inner_nested_classes;

public class MainMotherBoard {
    public static void main(String[] args) {
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println(usb.getTotalNumberOfPorts());
    }
}
