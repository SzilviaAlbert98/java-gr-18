package interfaces;

public class SmartWatch implements GPS {
    public long getGPSCoordonates() {
        System.out.println("afisare coordonare de pe smartwatch");
        return 100;
    }
}
