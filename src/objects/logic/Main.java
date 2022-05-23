package objects.logic;

import objects.data.Driver;


public class Main {

    public static void main(String[] args) throws Exception {
        DriverStat driver1 = new DriverStat(Driver.VERSTAPPEN, 3, 1, 87.354);
        System.out.println(driver1.toCSVEntry());

        Date date = new Date(2022, 05, 23);
        System.out.println(date.toString());

    }

}
