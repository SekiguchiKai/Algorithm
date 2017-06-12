package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by sekiguchikai on 2017/06/12.
 */
public class Sort {

    public static void insertionSort(String A, int N) {
        String[] stringA = A.split(" ");
        int[] intA = Stream.of(stringA).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < N; i++) {

            int value = intA[i];
            int j = i - 1;

            while (j >= 0 && intA[j] > value) {
                intA[j + 1] = intA[j];
                j--;
                intA[j + 1] = value;

            }
            Arrays.stream(intA).forEach(arr -> System.out.print(arr + " "));
            System.out.print("\n");
        }
    }
}
