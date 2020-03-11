import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AthleteWriter {

    /**
     * creating a file with results
     *
     * @param sortedList
     * @param result
     */
    public void athleteWriting(List<Athlete> sortedList, List<Integer> result) {
        //Reading file names from Keyboard
        System.out.println("Enter the path to create a directory: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("Enter the name of the desired a directory: ");
        path += sc.next();
        File directory = new File(path);

        //cerate directory
        directory.mkdirs();

        File file = new File(path + "\\winners.txt");
        try {
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);

            int time = result.get(0);
            int atleteIndex = 0;

            //two competitors can have the same score
            printWriter.println("Winner: ");
            while (sortedList.get(atleteIndex).calculateFinalTime() == time) {
                printWriter.println(sortedList.get(atleteIndex).resultTypePrinting());
                atleteIndex++;
            }

            time = result.get(1);
            printWriter.println("Runner-up: ");
            while (sortedList.get(atleteIndex).calculateFinalTime() == time) {
                printWriter.println(sortedList.get(atleteIndex).resultTypePrinting());
                atleteIndex++;
            }

            time = result.get(2);
            printWriter.println("Third Place: ");
            while (sortedList.get(atleteIndex).calculateFinalTime() == time) {
                printWriter.println(sortedList.get(atleteIndex).resultTypePrinting());
                atleteIndex++;
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


