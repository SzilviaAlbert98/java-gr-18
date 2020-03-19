package agregation;

public class MainMasina {
    public static void main(String[] args) {
        //masina vw de culoara alba cu motor capacitatae 1 si putere 75
        //AFISAM MSG: Masina X are culoare Y si ...

        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPutere(75);

        System.out.println("Motor VW are puterea : " + motorVW.getPutere());
        System.out.println("Motor VW are capacitate : " + motorVW.getCapacitate());

        Masina masinaVW = new Masina(motorVW, "VW");
        masinaVW.setCuloare("alb");

        System.out.println("Masina " + masinaVW.getNume()
                + " are culoarea " + masinaVW.getCuloare()
                + " si motorul de putere " + masinaVW.getMotor().getPutere()
                + " si capacitate: " + masinaVW.getMotor().getCapacitate());

        masinaVW = null;

    }
}
