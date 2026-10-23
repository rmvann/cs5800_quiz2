package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testSubtractNegative(){
        Calculator calculator = new Calculator();
        int expected = -5;
        int actual = calculator.subtract(-10,-5);
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplyPositive(){
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.multiply(2,2);
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplyNegative(){
        Calculator calculator = new Calculator();
        int expected = 12;
        int actual = calculator.multiply(-6,-2);
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplyZero(){
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.multiply(0,4);
        assertEquals(expected, actual);
    }

    @Test
    void testDividePositive(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.divide(8,4);
        assertEquals(expected, actual);
    }

    @Test
    void testDivideZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(3,0));
    }

    @Test
    void testIsEvenTrue(){
        Calculator calculator = new Calculator();
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    void testIsEvenFalse(){
        Calculator calculator = new Calculator();
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }
}
