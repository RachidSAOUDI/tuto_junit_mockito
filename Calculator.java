package com.junit.mockito;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
