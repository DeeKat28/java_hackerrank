package com.hacker.rank.programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        // Write a Java program to calculate the average of a list of integers using streams.
        calculateAverage();
    }

    public static void calculateAverage() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        double average = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(average);

    }
}
