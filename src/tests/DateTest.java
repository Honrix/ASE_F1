package tests;

import application_code.Date;
import org.junit.jupiter.api.*;

import static domain_code.values.RaceValues.*;
import static org.junit.Assert.*;


class DateTest {

    private Date date1;
    private Date date2;

    public DateTest() throws Exception {
        this.date1 = new Date(2022, 2, 3);
        this.date2 = new Date("20220203");
    }

    @Test
    void testToString() {
        Assertions.assertEquals("20220203", date1.toString());
        Assertions.assertEquals("20220203", date2.toString());
    }
}