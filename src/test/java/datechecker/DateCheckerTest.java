package datechecker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    @Test
    public void testHas31DaysTrue(){
        DateChecker dateChecker = new DateChecker();
        boolean actual = dateChecker.has31Days(Month.JANUARY);
        assertTrue(actual);
    }

    @Test
    public void testHas31DaysFalse(){
        DateChecker dateChecker = new DateChecker();
        boolean actual = dateChecker.has31Days(Month.APRIL);
        assertFalse(actual);
    }

    @ParameterizedTest
    @EnumSource(value=Month.class, names={"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31DaysTrue_Parameterized(Month month){
        DateChecker dateChecker = new DateChecker();
        boolean actual = dateChecker.has31Days(month);
        assertTrue(actual);
    }

    @ParameterizedTest
    @EnumSource(value=Month.class, names={"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testHas31DaysFalse_Parameterized(Month month){
        DateChecker dateChecker = new DateChecker();
        boolean actual = dateChecker.has31Days(month);
        assertFalse(actual);
    }
}
