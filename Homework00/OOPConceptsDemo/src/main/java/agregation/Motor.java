package agregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor(){
        this.capacitate = 0.8;
        this.putere = 75;
    }

    public Motor(int putere, double capacitate) {
        this.putere = putere;
        this.capacitate = capacitate;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("Nu puteti sa introduce valori mai mica deact 75 pt putere");
        } else {
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0) {
            System.out.println("Nu puteti sa introduce valori mai mica deact 0.8 pt capacitate");
        } else {
            this.capacitate = capacitate;
        }
    }
}
