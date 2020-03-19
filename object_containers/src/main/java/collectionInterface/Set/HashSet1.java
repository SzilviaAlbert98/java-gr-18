package collectionInterface.Set;

//nem engedelyezett az elemek ismetlese
//nincs sorrend rogzitve
//not ordered, not sorted

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();

        //elem hozzaadasa
        h.add(35);
        System.out.println(h.contains(35));

        //osszes elem torlese
        h.clear();
        h.add(103);
        h.add(107);
        h.add(227);

        if (h.contains(107)) {
            System.out.println("Van 107- es elem");
        }

        Iterator it = h.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Toroljuk a 227-es erteket");
        h.remove(227);

        for (Integer element : h) {
            System.out.println(element);
        }

        //meret
        System.out.println("A set merete: " + h.size());

        //Object tombbe alakitasa
        Object[] t = h.toArray();
        System.out.println("A tomb elso eleme: " + t[0]);

        Integer[] t2 = h.toArray(new Integer[h.size()]);
        System.out.println("Az Integer tipusu tombom: ");
        for (Integer element : t2) {
            System.out.print(element + " ");
        }
    }

}
