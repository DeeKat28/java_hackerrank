package com.hacker.rank.programs;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        BigInteger num1 = new BigInteger(one);
        BigInteger num2 = new BigInteger(two);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
        scanner.close();
    }
}
