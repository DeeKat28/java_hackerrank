package com.hacker.rank.programs;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.split("[^A-Za-z]+");
        int tokenCount = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > 0) {
                tokenCount++;
            }
        }
        System.out.println(tokenCount);
        for (String token: tokens) {
            if (token.length() > 0)
                System.out.println(token);
        }
        scan.close();
    }
}
