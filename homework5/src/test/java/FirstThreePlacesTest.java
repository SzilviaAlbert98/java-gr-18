import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstThreePlacesTest {

    private FirstThreePlaces firstThreePlaces;

    @Test
    void testGetBestResults() {
        firstThreePlaces = new FirstThreePlaces();

        Athlete a1 = new Athlete(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        Athlete a2 = new Athlete(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Athlete a3 = new Athlete(7,"Adam Mathew:","UK","29:15","xxoox","xooxo","xxxxo");
        Athlete a4 = new Athlete(30,"Lamba Lambda","RO","29:50","xxxox","xoxxx","xxxxx");

        List<Athlete> athletes = new ArrayList<>();
        athletes.add(a1);
        athletes.add(a2);
        athletes.add(a3);
        athletes.add(a4);

        List<Integer> result = Arrays.asList(1810,1815,1857);
        List<Integer> currentResult = firstThreePlaces.getBestResults(athletes);

        assertEquals(result,currentResult);
    }
}