package ro.scl.metricDistance;

import java.util.*;

public class SortMetricDistance {

    /**
     * ez a metodus rendezi a MetricDistance tipusu objektumokat
     *
     * @param unsorted
     * @return
     */
    public List<MetricDistance> sortMd(List<MetricDistance> unsorted) {
        List<MetricDistance> result = new ArrayList<>(unsorted);
        //Collections.sort(result);
        return result;
    }

    /**
     * ez a metodus rendezi a String tipusu objektumokat
     *
     * @param unsorted
     * @return
     */
    public List<String> sort(List<String> unsorted) {
        List<String> result = new ArrayList<>(unsorted);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) throws Exception{
        MetricDistance m1 = new MetricDistance(1, "Km");
        MetricDistance m2 = new MetricDistance(11, "cm");
        MetricDistance m3 = new MetricDistance(20, "m");
        MetricDistance m5 = new MetricDistance(19, "m");
        MetricDistance m4 = new MetricDistance(11, "cm");
        List<MetricDistance> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        SortMetricDistance smd = new SortMetricDistance();
        //List<MetricDistance> result = smd.sortMd(list);

       /* for (MetricDistance mm : result) {
            System.out.println(mm);
        }*/

       /* Iterator<MetricDistance> it = result.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        Collection<MetricDistance> result = smd.eliminateDuplicates(list);
        print(result);
    }

    /**
     * kiirja a kollekcio elemeit
     *
     * @param result
     */
    private static void print(Collection<MetricDistance> result) {
        /*for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }*/

        for (MetricDistance mm : result) {
            System.out.println(mm);
        }
    }

    /**
     * kikoszoboli a duplakat
     *
     * @param possibleDublicates
     * @return
     */
    public Set<MetricDistance> eliminateDuplicates(Collection<MetricDistance> possibleDublicates) {
        Set<MetricDistance> result = new TreeSet<>();
        result.addAll(possibleDublicates);
        return result;
    }
}
