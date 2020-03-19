package inner_nested_classes;

public class MotherBoard {
    private String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    public static class USB {
        int usb1 = 2;
        int usb2 = 1;

        int getTotalNumberOfPorts () {
            return usb1 + usb2;
        }
    }
}
