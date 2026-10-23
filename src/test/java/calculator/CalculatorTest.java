package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testSumPositive() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.sum(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSumNegative() {
        Calculator calculator = new Calculator();
        int expected = -1;
        int actual = calculator.sum(2, -3);
        assertEquals(expected, actual);
    }

    @Test
    void testSumZero() {
        Calculator calculator = new Calculator();
        int expected = 9;
        int actual = calculator.sum(0, 9);
        assertEquals(expected, actual);
    }

    @Test
    void testSubtractPositive(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.subtract(8, 6);
        assertEquals(expected, actual);
    }
}
