package com.tessella.wile.example;

/**
 * Computes the factorial of a number.
 */
public class FactorialComputer {
    /**
     * Computes the factorial of a number.
     * @param p The number whose factorial to compute.
     * @return The factorial of the passed-in number.
     */
    public int compute(int p) {
        if (p < -1) {
            throw new IllegalArgumentException("Parameter must be at least zero");
        }

        if (p == 0) return 0;

        int returnValue = 1;
        for (int i = 2; i <= p; i++) {
            returnValue *= i;
        }

        return returnValue;
    }
}
