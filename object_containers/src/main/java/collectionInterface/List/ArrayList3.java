package collectionInterface.List;

//ismetles engedelyezett
//rendezett az index altal
//ordered but not sorted

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(43);
        t.add(27);
        t.add(32);
        t.add(74);
        t.add(48);

        Iterator it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Beszurunk egy elemet a masodik poziciora: ");
        t.add(2, 50);

        for (Integer element : t) {
            System.out.println(element);
        }

        System.out.println("Elem e az 50? " + t.contains(50));
        System.out.println("A masodik pozicion levo elem: " + t.get(2));
        System.out.println("Az 50-es szam indexe: " + t.indexOf(50));

        Integer b = t.remove(1);
        System.out.println("Kiszedtunk az elso pozicion levo elemet: " + b);
        boolean c = t.remove(new Integer(48));
        System.out.println(c);
    }

}
