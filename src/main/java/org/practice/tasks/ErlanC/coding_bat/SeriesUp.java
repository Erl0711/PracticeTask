package org.practice.tasks.ErlanC.coding_bat;

import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
    }

    public static int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];
        int val = 1;
        for (int i = 0; i < arr.length; ) {
            for (int j = 1; j <= val; j++) {
                if (i < arr.length) {
                    arr[i] = j;
                    i++;
                }
            }
            val++;
        }
        return arr;
    }
}
