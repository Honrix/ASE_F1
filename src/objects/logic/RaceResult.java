package objects.logic;

import objects.values.RaceValues;

public class RaceResult {
/*
    final Track trackName;
    final DriverStat[] leaderboard;
    private int lengthTime;
    final String date;          //YYYYMMDD

    final RaceLength[] lengths = RaceLength.values();

    public RaceResult(Track trackName, DriverStat[] leaderboard, int lengthTime, String date) {
        if(!validateDate(date) || !validateLengthTime(lengthTime)){
            System.out.println("Invalid input for RaceResult");
        }
        this.trackName = trackName;
        this.leaderboard = leaderboard;
        this.lengthTime = lengthTime;
        this.date = date;

    }

    public Track getTrackName() {
        return trackName;
    }

    public DriverStat[] getLeaderboard() {
        return leaderboard;
    }

    public int getLengthTime() {
        return lengthTime;
    }

    public String getDate() {
        return date;
    }


    @Override
    public boolean validateLengthTime(int time) {
        for(RaceLength value: lengths){
            if(time == value.getLength()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validateDate(String date) {
        if(date.length() == 8){
            return true;
        }
        return false;
    }*/
}
