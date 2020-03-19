package interfaces;

public class SmartPhone implements GPS, Radio {
    public long getGPSCoordonates() {
        System.out.println("afisare coordonate smartphone");
        return 0;
    }

    @Override
    public void playChannel() {
        System.out.println("channel is playing");
    }

    @Override
    public void stopChannel() {
        System.out.println("channel was stopped");
    }

    //daca doresc sa extind functionalitatea metodei default din interfta
    @Override
    public void next() {
        System.out.println("do something else and than call the logic from bASE");
        Radio.super.next();
    }
}
