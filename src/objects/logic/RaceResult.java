package objects.logic;

import objects.data.Track;
import objects.values.RaceValues;
import validators.RaceResultValidator;

import static objects.values.RaceValues.*;

public class RaceResult implements RaceResultValidator {

    private static Track trackName;
    private static DriverStat[] leaderboard;
    private static int lengthTime;      //Int als Prozentzahl der Länge des Rennens
    private static Date date;           //YYYYMMDD

    final RaceValues[] lengths = {FULL_LENGTH, HALF_LENGTH, FOURTH_LENGTH};

    public RaceResult(Track trackName, DriverStat[] leaderboard, int lengthTime, Date date) throws Exception {
        if(validateLengthTime(lengthTime)) {
            this.trackName = trackName;
            this.leaderboard = leaderboard;
            this.lengthTime = lengthTime;
            this.date = date;
        } else {
            throw new IllegalArgumentException("Error by creating the result of a certain race");
        }

    }

    @Override
    public boolean validateLengthTime(int length) {
        for(RaceValues value: lengths){
            if(length == value.getNumber()){
                return true;
            }
        }
        return false;
    }
}
