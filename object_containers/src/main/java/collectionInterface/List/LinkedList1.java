package collectionInterface.List;

import java.util.LinkedList;

public class LinkedList1 {
    //oredered by index, not sorted
    public static void main(String[] args) {
        LinkedList<Integer> ketszeres = new LinkedList<Integer>();
        ketszeres.addFirst(10);
        ketszeres.addFirst(20);
        ketszeres.addFirst(30);
        ketszeres.addLast(40);
        ketszeres.add(50);

        for (Integer element : ketszeres) {
            System.out.println(element);
        }
    }
}
