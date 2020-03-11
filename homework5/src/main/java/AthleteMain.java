import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class AthleteMain {
    public static void main(String[] args) {
        //reading and storing input data
        AthleteReader athleteReader = new AthleteReader();
        List<Athlete> athletes = athleteReader.readAthlete("input.CSV");

        //Determination and storage of the top three time results
        FirstThreePlaces firstThreePlaces = new FirstThreePlaces();
        List<Integer> bestResults = firstThreePlaces.getBestResults(athletes);

        //Sorting input data by result for a faster search
        Comparator<Athlete> compareByResult = Comparator.comparing(Athlete::calculateFinalTime);
        Collections.sort(athletes, compareByResult);

        //Printing the winners in a new file
        AthleteWriter athleteWriter = new AthleteWriter();
        athleteWriter.athleteWriting(athletes, bestResults);

    }
}
