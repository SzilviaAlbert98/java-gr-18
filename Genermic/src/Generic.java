import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List something = new ArrayList();
        something.add("text");
        something.add(1);

        Integer firstElement = (Integer) something.get(1);
        Integer firsElementWrong = (Integer) something.get(0);

        List<Integer> intList = new ArrayList<Integer>();

    }
}
