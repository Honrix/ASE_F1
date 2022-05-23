package application_code;

import domain_code.data.Driver;
import domain_code.data.Track;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        DriverStat driver1 = new DriverStat(Driver.VERSTAPPEN, 3, 1, 87.354);
        DriverStat test1 = new DriverStat(Driver.HAMILTON, 1, 5, 90.525);
        DriverStat test2 = new DriverStat(Driver.ALONSO, 2, 3, 49.948);

        List<DriverStat> liste = new ArrayList<>();
        liste.add(driver1);
        liste.add(test1);
        liste.add(test2);
        Controller controller = new Controller(liste);
        Date date1 = new Date("20220523");
        RaceResult raceResult = new RaceResult(Track.BELGIUM, controller.getDriverStats(), 100, date1);
        controller.getDriverStats().forEach(driverStat -> System.out.println(driverStat.getName() + " - " + driverStat.getFinalPosition()));

        Date date2 = new Date(2022, 05, 23);
        System.out.println(date2.toString());



    }

}
