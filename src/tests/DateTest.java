package tests;

import objects.logic.Date;
import org.junit.jupiter.api.*;

import static objects.values.RaceValues.*;
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

    @Test
    void validateDate() {
        Assertions.assertTrue(date1.validateDate(2022, 02, 03));
        Assertions.assertFalse(date1.validateDate(2022, 13, 03));
    }

    @Test
    void yearValidator() {
        assertTrue(date1.yearValidator(MIN_YEAR_OF_DATE.getNumber()));
        assertFalse(date1.yearValidator(MIN_YEAR_OF_DATE.getNumber() - 1));
        assertFalse(date1.yearValidator(MAX_YEAR_OF_DATE.getNumber() + 1));
    }

    @Test
    void monthValidator() {
        assertTrue(date1.monthValidator(5));
        assertFalse(date1.monthValidator(13));
        assertFalse(date1.monthValidator(-5));
        assertFalse(date1.monthValidator(0));
    }

    @Test
    void dayValidator() {
        assertTrue(date1.dayValidator(17));
        assertTrue(date1.dayValidator(31));
        assertFalse(date1.dayValidator(32));
        assertFalse(date1.dayValidator(0));
        assertFalse(date1.dayValidator(-5));
    }
}