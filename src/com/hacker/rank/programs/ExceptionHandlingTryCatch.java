package com.hacker.rank.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().toString().substring(6));
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
