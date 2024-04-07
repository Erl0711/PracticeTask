package org.practice.tasks.NurjigitC.main;

import org.practice.tasks.NurjigitC.CountYZ;
import org.practice.tasks.NurjigitC.EqualIsNot;
import org.practice.tasks.NurjigitC.MiddleWay;
import org.practice.tasks.NurjigitC.WithoutString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MiddleWayMethod();
        WithoutStringMethod();
        EqualIsNotMethod();
        CountYZMethod();
    }

    public static void MiddleWayMethod() {
        MiddleWay middleWay = new MiddleWay();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(middleWay.middleWay(a, b)));
    }

    public static void WithoutStringMethod() {
        WithoutString withoutString = new WithoutString();
        System.out.println(withoutString.withoutString("Nurjigit", "ig"));
    }

    public static void EqualIsNotMethod() {
        EqualIsNot equalIsNot = new EqualIsNot();
        System.out.println(equalIsNot.equalIsNot("This is notnot"));
    }

    public static void CountYZMethod() {
        CountYZ countYZ = new CountYZ();
        System.out.println(countYZ.countYZ("zoomz typey"));
    }
}
