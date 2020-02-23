package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50};

        //afisare elemente array
        afisareElementeArray(arrayInt);

        //calcul suma in functie de niste conditii
        //a) daca elementul din array == 30 nu se va calcula suma
        //b) daca suma depaseste valoarea 100, se intrerupe executia arrayului

        int suma = 0;
        SumaNrArray(arrayInt, suma);

        int numar = 1501;
        inversareNumar(numar);

        //afisare caracterele unui string
        //afisare nr de vocale
        afisareNrDeVocale();
    }

    private static void afisareNrDeVocale() {
        String propozitie = "ana are mere";
        char[] arrayCaractere = propozitie.toCharArray(); //stringbol csinal karaktersorozatot

        int nrVocale = 0;

        for (char element : arrayCaractere){
            System.out.println(element);

            if(element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u' ){
                nrVocale++;
            }
        }

        System.out.println("Numarul vocalelelor din string: " + nrVocale);
    }

    private static void inversareNumar(int numar) {
        int numarInversat = 0;
        while (numar > 0){
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }

        System.out.println("Numar inversat este: " + numarInversat);
    }

    private static void SumaNrArray(int[] arrayInt, int suma) {
        for (int element : arrayInt){
            if (element == 30) {
                continue;
            }

            if (suma > 100){
                break;
            }

            suma = suma + element;
            System.out.println("element: " + element + " suma: " + suma);
        }
        System.out.println("Am iesit din bucla for. Suma finala este: " + suma);
    }

    private static void afisareElementeArray(int[] arrayInt) {
        for (int element : arrayInt){
            System.out.println(element);
        }
    }

}
