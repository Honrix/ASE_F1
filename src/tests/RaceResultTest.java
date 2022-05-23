package tests;

import objects.data.Driver;
import objects.data.Track;
import objects.logic.Date;
import objects.logic.DriverStat;
import objects.logic.RaceResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceResultTest {

    private RaceResult raceResult;

    public RaceResultTest() throws Exception {
        try {
            DriverStat driver1 = new DriverStat(Driver.RAIKKONEN, 20, 1, 90.000);
            DriverStat driver2 = new DriverStat(Driver.HAMILTON, 1, 20, 180.000);
            DriverStat[] leaderboard = {driver1, driver2};

            this.raceResult = new RaceResult(Track.BELGIUM, leaderboard, 25, new Date("20220523"));
            this.raceResult = new RaceResult(Track.BELGIUM, leaderboard, 35, new Date("20220523"));
        } catch (Exception e){
            assertEquals("Error by creating the result of a certain race", e.getMessage());
        }

    }

    @Test
    void validateLengthTime() {
        assertTrue(raceResult.validateLengthTime(25));
        assertTrue(raceResult.validateLengthTime(50));
        assertTrue(raceResult.validateLengthTime(100));
        assertFalse(raceResult.validateLengthTime(23));
        assertFalse(raceResult.validateLengthTime(-15));
        assertFalse(raceResult.validateLengthTime(1000));
    }
}