

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //    Create a Person / Car custom object of choice with any number of fields (> 2) of different types.
//    1) Write 5 different instances of that object.
//      Add the instances to a list.

        Car car1 = new Car("Mazda", "3", Flue.DIESEL, 110, 1.6, 2007, Optional.empty());
        Car car2 = new Car("Mercedes", "C- Class", Flue.PETROL_PHEV, 250, 2.0, 2015, Optional.of("black"));
        Car car3 = new Car("McLaren", "GT", Flue.PETROL, 620, 4.0, 2019, Optional.empty());
        Car car4 = new Car("Mercedes", "E- Class", Flue.DIESEL_HYBRID, 232, 2.2, 2014, Optional.empty());
        Car car5 = new Car("Lamborghini", "Aventador", Flue.PETROL, 620, 4.5, 2010, Optional.empty());

        List<Car> carList = Arrays.asList(car1, car2, car3, car4, car5)
                .stream()
                .collect(Collectors.toList());

//    2) Find the elements containing the letter "a" that start with "M" and print them out.
//       Add the instances to a set.
        Set<Car> carsWithM = elementsThatStartWithM(carList);
        System.out.println();

//    3) Find the "min" using a custom comparing criteria of choice
//       The smallest engine capacity
        double minEngineCapacity = findTheMinEngineCapacity(carList);
        System.out.println("The smallest engine capacity in the Car list: " + minEngineCapacity);

//    4) Generate 5 random Strings and add them to a Set. Find the "max" (while explaining as Javadoc how comparing Strings works)
        Set<String> randomStringsSet = generateRandomStringSet();
        System.out.println("\nStrings in the set are: ");
        randomStringsSet.forEach(System.out::println);
        System.out.println("\nThe last String in alphabetical order: " + maxFromStrings(randomStringsSet));

//    5) Generate a random number of Integers and then count them.
//       "Map" the exponential to the numbers and then print them out.
        randomNumbersInMap(randomNumbersInList());

//    6) Create a map of "n" (K,V) elements and print "how many" elements have value over 10
//       (the key is of your choice)
        nElementInMap(15);

//    7) Sort the above Set<String> (used for max) in reverse order
        System.out.println("\nThe content of the Set: ");
        randomStringsSet.forEach(System.out::println);
        System.out.println("\nThe above Set<String> in reverse order: ");
        sortingStringsInReverseOrder(randomStringsSet).forEach(System.out::println);


//    8) Sort the above List of custom objects (used for filter) in an order you consider
        System.out.println("\nThe sorted Set in reverse order: ");
        sortingCustomObjects(carsWithM).forEach(System.out::println);

//    9) Check if any of your instances "match" a condition based on an Integer field (of your choice).
//       What does it return ? Print it out.
        if (checkIf(carList)) System.out.println("\nAt least one car has a power greater than 250.");
        else System.out.println("\nNo result found");

//    10) What does Optional represent ? Explain through an example on your custom object
//          -> Wrap an existing instance
//          -> Wrap a null
//          -> Check value using ifPresent or isPresent
        Car car6 = new Car("Mercedes", "CLS", Flue.DIESEL_HYBRID, 250, 2.0, 2019, Optional.of("white"));
        carList.add(car6);
        Car car7 = new Car("Maserati", "Granturismo", Flue.PETROL, 405, 4.3, 2009, Optional.ofNullable("null"));
        carList.add(car7);

        System.out.println("\nColors specified at some cars: ");
        colorIsPresent(carList).forEach(System.out::println);

//     11) Fastest way to find the shortest String in a List
//         (take the 5 random Strings generated above and find the shortest one).
        System.out.println("\nElements of the set: ");
        randomStringsSet.forEach(System.out::println);
        System.out.println("\nShortest String: " + shortestString(randomStringsSet));

    }

    /**
     * this method finds the shortest String in the Set
     *
     * @param set Set of String
     * @return String type
     */
    private static String shortestString(Set<String> set) {
        return set.stream().min(Comparator.comparingInt(String::length)).get();
    }

    /**
     * color is an Optional characteristic at Car objects
     * It is not necessary to define
     * It can be an empty field
     *
     * @param carList List of Car
     * @return List of String
     */
    private static List<String> colorIsPresent(List<Car> carList) {
        return carList
                .stream()
                .map((s) -> s.getColor())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    /**
     * this method verifies that there is a car in List with a power of greater than 250
     *
     * @param carList List of Car
     * @return boolean value
     */
    private static boolean checkIf(List<Car> carList) {
        return carList
                .stream()
                .map(s -> s.getPower())
                .anyMatch(s -> s > 250);
    }

    /**
     * this method sorts the List in reverse order
     *
     * @param set Set of String
     * @return List of String
     */
    private static List<String> sortingStringsInReverseOrder(Set<String> set) {
        return set
                .stream()
                .sorted(Comparator.comparing(String::valueOf).reversed())
                .collect(Collectors.toList());
    }

    /**
     * this method sorts the List by the "make"
     *
     * @param set Set of Car
     * @return List of Car
     */
    private static List<Car> sortingCustomObjects(Set<Car> set) {
        return set
                .stream()
                .sorted(Comparator.comparing(Car::getMake).reversed())
                .collect(Collectors.toList());
    }

    /**
     * this method creates a Map with random numbers, and define the number of elements, which have value over 10
     *
     * @param n the number of the Integers
     */
    private static void nElementInMap(int n) {
        Random random = new Random();
        int index = 1;
        Map<Integer, Integer> map = new HashMap<>();

        while (index <= n) {
            map.put(index, random.nextInt());
            index++;
        }

        System.out.println("\nThe content of the map: " + map);

        long nr = map
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 10)
                .count();

        System.out.println("Number of elements have value over 10: " + nr);

    }

    /**
     * this method counts the elements of the list, calculates the exponential to the numbers,
     * converts the List to Map, and then prints the elements out
     *
     * @param randomNumbersInList List of random Integer
     */
    private static void randomNumbersInMap(List<Integer> randomNumbersInList) {
        List<Double> list = randomNumbersInList
                .stream()
                .mapToDouble(s -> Math.log1p((double) s))
                .boxed()
                .collect(Collectors.toList());

        long number = randomNumbersInList
                .stream()
                .count();

        int i = 0;
        Map<Integer, Double> result = new HashMap<>();
        for (Double element : list) {
            result.put(++i, element);
        }

        System.out.println("\nRandom numbers: ");
        randomNumbersInList.forEach(System.out::println);
        System.out.println("\nNumber of random numbers of Integer: " + number);
        System.out.println("\nThe exponential to the numbers: ");
        result.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


    }

    /**
     * this method generates a list of random number (less than 50) of random Integers
     * @return List of Integer
     */
    private static List<Integer> randomNumbersInList() {
        Random rand = new Random();
        return IntStream
                .generate(() -> rand.nextInt(10))
                .limit(new Random().nextInt(50))
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * this method returns the last String in alphabetical order
     * The String Comparator compares two Strings character by character lexicographically based on natural ordering
     * and returns an int type value
     *
     * @param randomStringsSet Set of String
     * @return String type
     */
    private static String maxFromStrings(Set<String> randomStringsSet) {
        return randomStringsSet.stream()
                .max(Comparator.comparing(String::valueOf))
                .get();
    }

    /**
     * it generates a Set with random Strings
     *
     * @return Set of String
     */
    private static Set<String> generateRandomStringSet() {
        Set<String> randomStrings = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            randomStrings.add(generateRandomString());
        }
        return randomStrings;
    }

    /**
     * this method generates a random String with a random length less than 25
     *
     * @return String type
     */
    private static String generateRandomString() {
        Random random = new Random();
        return random.ints(97, 122)
                .limit(new Random().nextInt(25))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    /**
     * this method returns the min value of car powers
     *
     * @param carList List of Car
     * @return double type value
     */
    private static double findTheMinEngineCapacity(List<Car> carList) {
        double minEngineCapacity = carList
                .stream()
                .map(s -> s.getEngineCapacityInLiter())
                .min(Comparator.comparing(Double::valueOf))
                .get();

        return minEngineCapacity;
    }


    /**
     * this method Returns a set, in which each element mark name contains the letter 'a' and starts with 'M'
     */
    private static Set<Car> elementsThatStartWithM(List<Car> carList) {
        System.out.println("Names that contain the letter 'a' and start with 'M': ");
        Set<Car> carsWithM = carList
                .stream()
                .filter(s -> s.getMake().contains("a"))
                .filter(s -> s.getMake().startsWith("M"))
                .collect(Collectors.toSet());
        carsWithM.forEach(System.out::println);

        return carsWithM;
    }
}