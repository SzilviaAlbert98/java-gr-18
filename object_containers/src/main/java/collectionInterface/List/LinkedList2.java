package collectionInterface.List;

import java.util.*;

// //oredered by index, not sorted
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
