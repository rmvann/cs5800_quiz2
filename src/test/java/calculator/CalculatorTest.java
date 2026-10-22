package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.sum(2, 3);
        assertEquals(expected, actual);
    }
}
