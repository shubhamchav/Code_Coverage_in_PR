package com.movieapp;

public class LowCoverageSample {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }

    public int negate(int a) {
        return -a;
    }

    public int abs(int a) {
        return a < 0 ? -a : a;
    }

    public int gcd(int a, int b) {
        a = abs(a);
        b = abs(b);

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD is undefined for 0 and 0");
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
