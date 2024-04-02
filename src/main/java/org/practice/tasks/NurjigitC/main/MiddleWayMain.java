package org.practice.tasks.NurjigitC.main;

import org.practice.tasks.NurjigitC.MiddleWay;

import java.util.Arrays;

public class MiddleWayMain {
    public static void main(String[] args) {
        MiddleWay middleWay = new MiddleWay();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(middleWay.middleWay(a, b)));
    }
}
