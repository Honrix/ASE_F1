package validators;

public interface DriverStatValidator {

    boolean validatePosition(int position);

    boolean validateFastestLap(double time);
}
