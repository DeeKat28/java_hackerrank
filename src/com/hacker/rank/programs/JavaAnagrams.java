package com.hacker.rank.programs;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for (int i = 0; i < a.length(); i++) {
            arr1[a.charAt(i)]++;
            arr2[b.charAt(i)]++;
        }

        for (int i = 0; i < 128; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
