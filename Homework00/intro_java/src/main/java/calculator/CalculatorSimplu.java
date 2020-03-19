package calculator;

public class CalculatorSimplu {
    public static void main(String[] args) {
        //args - 1 * 2
        if (args.length < 3) {
            System.out.println("Trebuie sa avem o sintaxa ca in exemplu: 1 * 2");
        } else {
            int numar1 = Integer.parseInt(args[0]);
            int numar2 = Integer.parseInt(args[2]);
            String operator = args[1];

            calculeaza(numar1, numar2, operator);
        }
    }

    /**
     * Metoda care returneaza un calcul matematic
     *
     * @param numar1 o variabila de tip int
     * @param numar2 o variabila de tip int
     * @param operator care pote fi +, -, *, /
     */

    public static void calculeaza(int numar1, int numar2, String operator) {
        switch (operator.charAt(0)) {
            case '-':
                int rezultat = numar1 - numar2;
                System.out.println(rezultat);
                break;
            case '+':
                int rezultat1 = numar1 + numar2;
                System.out.println(rezultat1);
                break;
            case '*':
                int rezultat2 = numar1 * numar2;
                System.out.println(rezultat2);
                break;
            case '/':
                int rezultat3 = numar1 / numar2;
                System.out.println(rezultat3);
                break;
            default:
                System.out.println("Nu ati introdus +, -, /, *");
        }
    }
}
