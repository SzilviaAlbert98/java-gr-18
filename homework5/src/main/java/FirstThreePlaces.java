import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstThreePlaces {
    /**
     * Defines the three smallest numbers in an int type list
     * @param athletes
     * @return integer type List
     */
    public List<Integer> getBestResults(List<Athlete> athletes) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (Athlete athlete : athletes) {
            int time = athlete.calculateFinalTime();
            if (time < first) {
                third = second;
                second = first;
                first = time;
            } else if (time < second && time != first) {
                third = second;
                second = time;
            } else if (time < third && time != second && time != first) {
                third = time;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(first);
        result.add(second);
        result.add(third);

        return result;
    }
}
