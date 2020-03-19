package inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee angajat1 = new Employee();
        angajat1.setNume("X");
        angajat1.setSalar(1000);

        Programmer programmer1 = new Programmer();
        programmer1.setNume("Y");
        programmer1.setSalar(2000);
        programmer1.setBonus(100);

        System.out.println("Angajat: " + angajat1.getNume() + " " + angajat1.getSalar());
        System.out.println("Programmer: " + programmer1.getNume() + " " + programmer1.getSalar() + " "
                + programmer1.getBonus());

    }
}
