import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        //1. Calculate the sum of the first 100 numbers higher than 0
        System.out.println("The sum of the first 100 number higher than 0: " + calculateSum());
        System.out.println();

        //2. Display the smallest number from an array of number
        int[] array = {-1, 0, 90, -25, 45, 85, 16, 9, -3};
        displayArrayValues(array);
        smallestNumber(array);
        System.out.println();

        //3. Display the max digit from a number.
        int number = -2099185781;
        maxDigit(number);
        System.out.println();

        //4. Check if a number is palindrom( e.g palindrom 1221, 34143)
        int number1 = 112;
        resultPalindrom(number1);
        System.out.println();

        //5. Display all the prime numbers lower than a given number
        int limit = -200;
        displayPrimes(limit);


    }

    /**
     *
     * @param limit
     */
    private static void displayPrimes(int limit) {
        if (limit > 2) {
            System.out.print("All prime numbers lower than " + limit + " are: ");
            System.out.print(2);
            for (int number = 3; number < limit; number += 2) {
                if (checkPrime(number)) System.out.print(", " + number);
            }
        } else {
            System.out.println("Does not exist prime number lower than " + limit + "!");
        }
    }

    /**
     * Metoda care vaerifica daca un numar e prim sau nu si returneaze aceastea valoare logica
     * @param number este o variabila de tip integer
     * @return ok este o variabila de tip boolean care arata daca numarul este prim sau nu
     */
    private static boolean checkPrime(int number) {
        boolean ok;
        if (number <= 1) ok = false; //numbers less than or equal to 1 could not be primes
        else {
            if (number % 2 == 0) ok = (number == 2); //from even numbers only number 2 is prime
            else {
                if (number <= 5) ok = true; //every other number less than or equal to 5 is prime
                else {
                    if (((number + 1) % 6 != 0) && ((number - 1) % 6 != 0)) ok = false; //every prime number greater than 5 has the shape of 6k +/- 1
                    else {
                        ok = true;
                        int divisor = 3;
                        while (ok && (divisor * divisor <= number)) { //we are looking for the divisors of a number up to its root
                            if (number % divisor == 0) ok = false;
                            else divisor += 2;
                        }
                    }
                }
            }
        }
        return ok;
    }

    private static void resultPalindrom(int number) {
        if (number < 0) {
            System.out.println("A palindromic number is always a positive integer number, please check your input data! ");
        } else {
            if (checkPalindrom(number)) {
                System.out.println("Number: " + number + " is a palindromic number!");
            } else {
                System.out.println("Number: " + number + " is not a palindromic number!");
            }
        }
    }

    /**
     * Metoda care decide ca numarul este palindrom sau nu
     * @param number este o variabila de tip intreg
     * @return este a variabila de tip boolean
     */
    private static boolean checkPalindrom(int number) {
        int oldNumber = number;
        int inverseNumber = 0;
        while (number > 0) {
            inverseNumber = inverseNumber * 10 + number % 10;
            number /= 10;
        }
        return (oldNumber == inverseNumber);
    }

    /**
     * Matoda care cauta si dupa aceea afiseaza cifra maxima dintr- un numar
     * @param number este o variabila de tip intreg
     */
    private static void maxDigit(int number) {
        int oldNumber = number;
        int maxDigit = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number > 0 && (number % 10 != 9)) {
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
            number = number / 10;
        }
        if (number > 0) {
            System.out.println("The max digit from number " + oldNumber + " is: 9.");
        } else {
            System.out.println("The max digit from number " + oldNumber + " is: " + maxDigit);
        }
    }

    /**
     * Metoda care afiseaza valorile elementelor din array
     * @param array este un array de tip intreg
     */
    private static void displayArrayValues(int[] array) {
        System.out.print("Elements of " + Arrays.toString(array));
//        for (int element : array) {
//            System.out.print(element + ", ");
//        }
        System.out.println();
    }

    /**
     * Metoda care cauta si dupa aceea afiseaza elementul cu cea mai mica valoare dintr- un array
     * @param array este un array de tip intreg
     */
    private static void smallestNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array.length < 1) {
            System.out.println("This array is empty!");
        }
        else {
            for (int element : array){
                if (element < min){
                    min = element;
                }
            }
            System.out.println("The smallest number from " + Arrays.toString(array) + " is: " + min );
        }
    }

    /**
     * Metoda care returneaza suma primelor 100 de numere mai mare decat 0
     * @return sum este o variabila de tip intreg
     */
    private static int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }
}
