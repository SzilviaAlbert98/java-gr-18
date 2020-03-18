import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AthleteReader {

    /**
     * reading input data from a file
     *
     * @param fileName
     * @return an array of type Athlete
     */
    public List<Athlete> readAthlete(String fileName) {
        List<Athlete> athletes = new ArrayList<Athlete>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            int numberOfLines = 0;

            while (line != null) {
                String[] tokens = line.split(",");
                Athlete athlete = new Athlete(
                        Integer.parseInt(tokens[0]),
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        tokens[4],
                        tokens[5],
                        tokens[6]

                );

                //We add an athlete to the list if the athlete's data is correct
                if (athletes.contains(athlete) || !athlete.validSkiTimeResult() || !athlete.validShootingRange(athlete.getFirstShootingRange())
                        || !athlete.validShootingRange(athlete.getSecondShootingRange()) || !athlete.validShootingRange(athlete.getThirdShootingRange())) {
                    numberOfLines++;
                    System.out.println("Line nr." + numberOfLines + ": An athlete with the same number already exists for List, or the line contains invalid input data ");
                } else {
                    athletes.add(athlete);
                    numberOfLines++;
                }

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return athletes;
    }

}
