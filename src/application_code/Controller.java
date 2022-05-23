package application_code;

import java.util.Comparator;
import java.util.List;

public class Controller {

    private List<DriverStat> driverStats ;

    public Controller(List<DriverStat> driverStats){
        driverStats.sort(Comparator.comparingInt(DriverStat::getFinalPosition));
        this.driverStats = driverStats;
    }

    public List<DriverStat> getDriverStats() {
        return driverStats;
    }


}
