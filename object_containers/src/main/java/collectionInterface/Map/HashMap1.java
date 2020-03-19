package collectionInterface.Map;

//egyedi ID- val rendelkezo dolgok
//engedelyezett egy null kulcs es tobb null ertek
//unsorted, unordered

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> m = new HashMap<String, String>();
        m.put("alma", "apple");
        m.put("asztal", "table");
        m.put("szék", "chair");

        System.out.println("Visszaadja az alma kulcshoz tartozo erteket: " + m.get("alma"));

        System.out.println("Megnezzuk, hogy van e olyan kulcsunk, hogy alma: " + m.containsKey("alma"));
        System.out.println("Megnezzuk, hogy van e olyan elem, hogy apple: " + m.containsValue("apple"));

        Set<Map.Entry<String,String>> h = m.entrySet();
        System.out.println("------------------");
        Iterator<Map.Entry<String,String>> i = h.iterator();
        while (i.hasNext()) {
            Map.Entry<String,String> element = i. next();
            System.out.println("Kulcs: + " + element.getKey() + "\tertek: " + element.getValue());
        }
        System.out.println("------------------");

        System.out.println("------------------");
        for (Map.Entry<String,String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        System.out.println("------------------");

        String magyar = m.get("alma");
        System.out.println("Az alma jelentese: " + magyar);

        Set h2 = m.keySet();
        System.out.println("Van-e alma: " + h2.contains("alma"));

        String s = m.remove("asztal");
        System.out.println("Töröleve ez: " + s); //Eredmény: table

        m.clear();
        System.out.println(m.size());


    }
}
