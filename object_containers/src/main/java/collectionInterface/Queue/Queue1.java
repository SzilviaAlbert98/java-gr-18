package collectionInterface.Queue;
//varakozasi sor
//FIFO lista
public class Queue1 {
    public static void main(String[] args) {
        java.util.Queue<String> sor;
        sor = new java.util.LinkedList<String>();

        sor.add("elso");
        sor.add("masodik");
        sor.add("harmadik");

        System.out.println(sor.remove());
        System.out.println(sor.remove());
    }


}
