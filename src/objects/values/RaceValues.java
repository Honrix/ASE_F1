package objects.values;

public enum RaceValues {

    MAX_NUMBER_OF_DRIVERS(20),
    MIN_NUMBER_OF_DRIVERS(1),
    FULL_LENGTH(100),
    HALF_LENGTH(50),
    FOURTH_LENGTH(25);


    private int number;

    RaceValues(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

}
