package application_code;

import domain_code.data.Track;
import domain_code.values.RaceValues;
import validators.RaceResultValidator;

import java.util.List;

import static domain_code.values.RaceValues.*;

public class RaceResult implements RaceResultValidator {

    private Track trackName;
    private List<DriverStat> leaderboard;
    private int lengthTime;      //Int als Prozentzahl der Länge des Rennens
    private Date date;           //YYYYMMDD

    final RaceValues[] lengths = {FULL_LENGTH, HALF_LENGTH, FOURTH_LENGTH};

    public RaceResult(Track trackName, List<DriverStat> leaderboard, int lengthTime, Date date) throws Exception {
        if(!validateLengthTime(lengthTime)) {
            throw new IllegalArgumentException("Error by creating the result of a certain race");
        }
        this.trackName = trackName;
        this.leaderboard = leaderboard;
        this.lengthTime = lengthTime;
        this.date = date;

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
