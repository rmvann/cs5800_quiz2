package datechecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    @Test
    public void testHas31DaysTrue(){
        DateChecker dateChecker = new DateChecker();
        boolean actual = dateChecker.has31Days(Month.JANUARY);
        assertTrue(actual);
    }
}
