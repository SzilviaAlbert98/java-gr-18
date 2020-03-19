package exercitiu1;

public class AnimalMain {
    public static void main(String[] args) {
        Pisica pisica1 = new Pisica();
        pisica1.setNume("p1");
        Pisica pisica2 = new Pisica();
        pisica2.setNume("p2");

        Caine caine1 = new Caine();
        caine1.setNume("c1");

        //intrun adapost se afla 2 pisici si 1 caine. Vreau sa afisam numele lor

        Animal[] adapostAnimale = new Animal[3];
        adapostAnimale[0] = pisica1;
        adapostAnimale[1] = pisica2;
        adapostAnimale[2] = caine1;

        for (Animal aniaml: adapostAnimale){
            System.out.println(aniaml.getNume());
        }
    }
}

