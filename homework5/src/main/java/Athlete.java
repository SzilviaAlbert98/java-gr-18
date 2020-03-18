import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Athlete {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    /**
     * parameterized constructor
     */
    public Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    /**
     * returns the final result in seconds
     * @return int type value
     */
    public int calculateFinalTime() {
        int result = 0;
        result = convertSkiTimeResultToToSeconds() + convertShootingRangesToSeconds();
        return result;
    }

    /**
     * Splits the time, that you specified as a String into minutes and seconds and then calculates it in seconds
     * @return int type value, which represents the time in seconds
     */
    public int convertSkiTimeResultToToSeconds() {
        int minute;
        int second;

        int indexOfTwoDots = 2;
        minute = Integer.parseInt(skiTimeResult.substring(0, indexOfTwoDots));
        second = Integer.parseInt(skiTimeResult.substring(indexOfTwoDots + 1, skiTimeResult.length()));

        int finalsecond = minute * 60 + second;

        return finalsecond;
    }

    /**
     * returns the sum of the values of the shooting ranges
     * @return int type value, which represents the time in seconds
     */
    public int convertShootingRangesToSeconds() {
        int result = 0;
        result = generalShootingRangeConverter(firstShootingRange) + generalShootingRangeConverter(secondShootingRange) + generalShootingRangeConverter(thirdShootingRange);
        return result;
    }

    /**
     * converts the value of an shooting range given in String to seconds
     * @param s one of the three shooting ranges
     * @return int type value, that represents the time in seconds
     */
    public int generalShootingRangeConverter(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < 5; i++) {
            if (charArray[i] == 'o') result += 10;
        }
        return result;
    }

    /**
     * decides, that the shooting range was entered correctly
     * a shooting range is correctly entered if its length is 5 characters long and contains only 'x' and 'o' characters
     * @param shootingRange
     * @return boolean type value
     */
    public boolean validShootingRange(String shootingRange) {
        if (shootingRange.length() != 5) return false;
        else {
            int index = 0;
            while (true && index < 5) {
                if (shootingRange.charAt(index) != 'x' && shootingRange.charAt(index) != 'o') return false;
                index++;
            }
            return true;
        }
    }

    /**
     * decides, that the skiTimeResult was entered correctly
     * a skiTimeResult is correctly entered, if its length is 5 characters long,
     * if the two first and the two last characters of the String represent an integer
     * and the third character is a colon
     * @return boolean type value
     */
    public boolean validSkiTimeResult() {
        if (skiTimeResult.length() != 5) return false;

        try {
            int number1 = Integer.parseInt(skiTimeResult.substring(0, 2));
            int number2 = Integer.parseInt(skiTimeResult.substring(3, 5));
        } catch (NumberFormatException e) {
            return false;
        }

        if (skiTimeResult.charAt(2) != ':') return false;

        return true;
    }

    /**
     * If possible, convert seconds to minutes and then build a string from this
     * @param time
     * @return String type value
     */
    public String convertSecondsToString(int time) {
        int minute = time / 60;
        int second = time % 60;
        String string = " " + minute + ":" + second;
        return string;

    }

    /**
     * returns the athlete with its properties
     * @return String
     */
    public String resultTypePrinting() {
        return athleteName +
                convertSecondsToString(calculateFinalTime()) + " (" +
                convertSecondsToString(convertSkiTimeResultToToSeconds()) + " + " +
                convertSecondsToString(convertShootingRangesToSeconds()) + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return athleteNumber == athlete.athleteNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(athleteNumber);
    }

    //getters
    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }
}
