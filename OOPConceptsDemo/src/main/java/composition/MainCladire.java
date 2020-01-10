package composition;

public class MainCladire {
    public static void main(String[] args) {
        Cladire cladireaA = new Cladire("CBC");
        cladireaA.setMarimeCamera(100);
        cladireaA.setCuloareCamera("rosu");
        System.out.println(cladireaA.getNume() + "are o camera de culoare " + cladireaA.getCamera().getCuloare());
    }
}
