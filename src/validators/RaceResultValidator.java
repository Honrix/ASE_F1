package validators;

import java.util.Date;

public interface RaceResultValidator {

    boolean validateLengthTime(int time);

    boolean validateDate(Date date);

}