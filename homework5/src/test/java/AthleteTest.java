import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest {
    private Athlete athlete;

    @Test
    void testCalculateFinalTime() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xxxox",
                "xxxxx","xxoxo");

        assertEquals(1857,athlete.calculateFinalTime());
    }

    @Test
    void testConvertSkiTimeResultToToSeconds() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xxxox",
                "xxxxx","xxoxo");
        assertEquals(1827,athlete.convertSkiTimeResultToToSeconds());
    }

    @Test
    void testConvertShootingRangesToSeconds() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xxxox",
                "xxxxx","xxoxo");
        assertEquals(30,athlete.convertShootingRangesToSeconds());
    }

    @Test
    void testGeneralShootingRangeConverter() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xxxox",
                "xxxxx","xxoxo");
        String general = "xxoox";
        assertEquals(20,athlete.generalShootingRangeConverter(general));
    }

    @Test
    void testValidShootingRangePositive() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xoxox",
                "xxxxx","xxoxo");
        assertTrue(athlete.validShootingRange(athlete.getFirstShootingRange()));
    }

    @Test
    void testValidShootingRangeNegativeInvalidCharacter() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xPxox",
                "xxxxx","xxoxo");
        assertFalse(athlete.validShootingRange(athlete.getFirstShootingRange()));
    }

    @Test
    void testValidShootingRangeNegativeToLongString() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xxxxox",
                "xxxxx","xxoxo");
        assertFalse(athlete.validShootingRange(athlete.getFirstShootingRange()));
    }

    @Test
    void testValidSkiTimeResultPositive() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xoxox",
                "xxxxx","xxoxo");
        assertTrue(athlete.validSkiTimeResult());
    }

    @Test
    void testValidSkiTimeResultNegativeInvalidFormat() {
        athlete = new Athlete(11,"Umar Jorgson","SK","3:27","xoxox",
                "xxxxx","xxoxo");
        assertFalse(athlete.validSkiTimeResult());
    }

    @Test
    void convertSecondsToString() {
        athlete = new Athlete(11,"Umar Jorgson","SK","30:27","xoxox",
                "xxxxx","xxoxo");
        assertEquals(" 30:15",athlete.convertSecondsToString(1815));
    }
}