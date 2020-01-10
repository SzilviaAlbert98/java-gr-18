public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime){
        this.latime = latime;
        this.lungime = lungime;
    }

    public double getAria(){
        return lungime * latime;
    }

    public double getPerimetru(){
        return 2 * (lungime + latime);
    }

    public double getDiagonala(){
        return Math.sqrt(lungime * lungime + latime * latime);
    }
}
