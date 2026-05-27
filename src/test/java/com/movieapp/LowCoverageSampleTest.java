package com.movieapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowCoverageSampleTest {

    private final LowCoverageSample sample = new LowCoverageSample();

    @Test
    void testAdd() {
        assertEquals(5, sample.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, sample.subtract(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(12, sample.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(4, sample.divide(8, 2));
    }

    @Test
    void testDivideByZero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> sample.divide(8, 0));
        assertEquals("Division by zero", ex.getMessage());
    }

    @Test
    void testMod() {
        assertEquals(1, sample.mod(7, 3));
    }

    @Test
    void testSquare() {
        assertEquals(49, sample.square(7));
    }

    @Test
    void testCube() {
        assertEquals(27, sample.cube(3));
    }

    @Test
    void testNegate() {
        assertEquals(-10, sample.negate(10));
    }

    @Test
    void testAbsForNegativeAndPositive() {
        assertEquals(5, sample.abs(-5));
        assertEquals(5, sample.abs(5));
    }

    @Test
    void testGcdForPositiveNumbers() {
        assertEquals(6, sample.gcd(54, 24));
    }

    @Test
    void testGcdWithNegativeInputs() {
        assertEquals(4, sample.gcd(-8, 12));
    }

    @Test
    void testGcdWithOneZero() {
        assertEquals(9, sample.gcd(0, 9));
    }

    @Test
    void testGcdForDoubleZeroThrows() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> sample.gcd(0, 0));
        assertEquals("GCD is undefined for 0 and 0", ex.getMessage());
    }
}
