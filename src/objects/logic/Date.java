package objects.logic;

import validators.DateValidator;

import static objects.values.RaceValues.*;

public class Date implements DateValidator {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) throws Exception{
        if(validateDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Wrong Date");
        }
    }

    public Date(String dateAsString){       //YYYYMMDD
        if(dateAsString.matches("^\\d{8}$")){
            int year = Integer.parseInt(dateAsString.substring(0, 4));
            int month = Integer.parseInt(dateAsString.substring(4, 6));
            int day = Integer.parseInt(dateAsString.substring(6, 8));

            if(validateDate(year, month, day)){
                this.year = year;
                this.month = month;
                this.day = day;
            } else {
                throw new IllegalArgumentException("Wrong Date: " + dateAsString);
            }
        } else {
            throw new IllegalArgumentException("Wrong Date Format: " + dateAsString);
        }

    }

    public String toString() {
        return (year + "" + (month < 10? "0" + month : month)  + "" + (day < 10? "0" + day : day));
    }

    public boolean validateDate(int year, int month, int day){
        return (yearValidator(year) && monthValidator(month) && dayValidator(day));
    }

    @Override
    public boolean yearValidator(int year) {
        return !(year < MIN_YEAR_OF_DATE.getNumber() || year > MAX_YEAR_OF_DATE.getNumber());
    }

    @Override
    public boolean monthValidator(int month) {
        return !(month < 1 || month > 12);
    }

    @Override
    public boolean dayValidator(int day) {
        return !(day < 1 || day > 31);
    }
}
