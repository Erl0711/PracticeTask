package org.practice.tasks.NurjigitC;

import static org.practice.tasks.NurjigitC.CountYZ.countYZ;

public class Main {
    public static void main(String[] args) {
        MiddleWay middleWay = new MiddleWay();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(java.util.Arrays.toString(middleWay.middleWay(a, b)));
    }
}
