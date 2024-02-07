package com.hacker.rank.programs;

import java.util.Scanner;
class MyCalculatorWithException {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        else {
            return (long)Math.pow(n, p);
        }
    }

}

public class ExceptionHandlingThrowsThrow {
    public static final MyCalculatorWithException my_calculator = new MyCalculatorWithException();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
