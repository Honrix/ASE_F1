package tests;

import domain_code.data.Driver;
import application_code.DriverStat;

import static domain_code.values.RaceValues.*;
import static org.junit.jupiter.api.Assertions.*;

class DriverStatTest {

    private DriverStat test1;       //Valid Test-Object
    private DriverStat test2;       //Invalid Test-Object

    public DriverStatTest() throws Exception {
        try{
            test1 = new DriverStat(Driver.HAMILTON, 1, 1, 90.525);
            test2 = new DriverStat(Driver.VERSTAPPEN, 3, 2, -49.948);
        } catch (Exception e){
            assertEquals("Error by creating Max Verstappen (SP: 3, FP: 2, Laptime: -49.948)", e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void toCSVEntry() {
        assertEquals("1, HAMILTON, 1, 90.525", test1.toCSVEntry());
    }

    @org.junit.jupiter.api.Test
    void validatePosition() {
        assertTrue(test1.validatePosition(MIN_NUMBER_OF_DRIVERS.getNumber()));
        assertTrue(test1.validatePosition(MAX_NUMBER_OF_DRIVERS.getNumber()));
        assertFalse(test1.validatePosition(MIN_NUMBER_OF_DRIVERS.getNumber() - 1));
        assertFalse(test1.validatePosition(MAX_NUMBER_OF_DRIVERS.getNumber() + 1));
    }

    @org.junit.jupiter.api.Test
    void validateFastestLap() {
        assertTrue(test1.validateFastestLap(90193.095));
        assertFalse(test1.validateFastestLap(90193.0953));
    }
}