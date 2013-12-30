package com.tessella.wile.example;

import static java.lang.System.out;

/**
 * The main class.
 */
public class Main {

    /**
     * The main method.
     * @param args The arguments.
     */
    public static void main(String[] args) {
        FactorialComputer computer = new FactorialComputer();
        int result = computer.compute(Integer.parseInt(args[0]));
        out.println("The result is " + result);
    }
}
