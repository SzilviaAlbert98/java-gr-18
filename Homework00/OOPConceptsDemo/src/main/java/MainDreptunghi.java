public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptunghiA = new Dreptunghi(20.0, 10.0);
        System.out.println("Aria obiect dreptunghiA este: " + dreptunghiA.getAria());
        System.out.println("Perim obiect dreptunghiA este: " + dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB = new Dreptunghi(40.0, 40.0);
        System.out.println("Diagonala obiect dreptunghiB este: " + dreptunghiB.getDiagonala());

    }

}
