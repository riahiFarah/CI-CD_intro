package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.example.Calculator.Calculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testAdd() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }
    
}
