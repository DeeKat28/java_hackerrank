package com.hacker.rank.programs;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNo = 1;
        while (scanner.hasNext()) {
            System.out.println(lineNo + " " + scanner.nextLine());
            lineNo++;
        }
        scanner.close();
    }
}
