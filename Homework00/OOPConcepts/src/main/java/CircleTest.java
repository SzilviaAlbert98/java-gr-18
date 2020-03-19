public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red");

        System.out.println("Aria obiectului circlei1 este: " + circle1.getAria());
        System.out.println("Perimetrul obiectului circlei1 este: " + circle1.getPerimeter());
        System.out.println("Culoarea obiectului circlei1 este: " + circle1.color);

        Circle circle2 = new Circle(7.0, "green");

        System.out.println("Aria obiectului circlei2 este: " + circle2.getAria());
        System.out.println("Perimetrul obiectului circlei2 este: " + circle2.getPerimeter());
        System.out.println("Culoarea obiectului circlei2 este: " + circle2.color);

        Circle circle3 = new Circle(8.0, "black");

        System.out.println("Aria obiectului circlei3 este: " + circle3.getAria());
        System.out.println("Perimetrul obiectului circlei3 este: " + circle3.getPerimeter());
        System.out.println("Culoarea obiectului circlei3 este: " + circle3.color);

        Circle circle4 = new Circle(10.0, "pink");
        System.out.println("APELARE METODE DIN OBJECT CLASS");
        System.out.println(circle4);
        System.out.println(circle4.toString());

        createArrayOfCircle();
    }
    private static void createArrayOfCircle() {
        Circle[] circleArray = new Circle[10];

        for (int i = 0; i <= circleArray.length-1; i++){
            if (i%2 == 0) {
                Circle circleEven = new Circle(i+1, "blue");
                circleArray[i] = circleEven;
            } else {
                Circle circleOdd = new Circle(i+1, "green");
                circleArray[i] = circleOdd;
            }
        }

        for (Circle elements : circleArray){
            System.out.println(elements.color);
        }
    }
}
