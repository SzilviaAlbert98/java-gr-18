package primitiveandnonprimitiveexamples;

public class Examples {
    public static void main(String[] args) {

        int aPrimitiveValue = 5;
        changePrimitiveValue(aPrimitiveValue);
        System.out.println(aPrimitiveValue);

        Test test = new Test();
        test.setInstanceVariable(888);
        System.out.println(test.getInstanceVariable());

        changeObjectValue(test);
        System.out.println(test.getInstanceVariable());

    }

    //pt variabilele primitive se paseaza VALOAREA
    public static void changePrimitiveValue(int value)
    {
        value = 100;
    }

    public static void changeObjectValue(Test obiect){
        obiect.setInstanceVariable(1000);
    }
}
