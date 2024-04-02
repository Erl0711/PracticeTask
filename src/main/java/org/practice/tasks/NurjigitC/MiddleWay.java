package org.practice.tasks.NurjigitC;

import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {5, 9, 0};
        System.out.println(Arrays.toString(middleWay(a, b)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
