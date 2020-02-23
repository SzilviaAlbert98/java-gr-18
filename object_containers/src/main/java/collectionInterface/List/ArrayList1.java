package collectionInterface.List;

import java.util.*;

//ordered by index, not sorted
public class ArrayList1<S> {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(1.1);
        array.add(2.2);
        array.add(2, 3.3);

        try {
            array.add(4, 5.5);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Index error: " + e);
        }

        Iterator<Double> it = array.iterator();
        while (it.hasNext()) {
            System.out.println(it.hasNext());
        }
    }
}
