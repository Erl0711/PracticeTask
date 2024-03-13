package org.practice.tasks.AsanC.warmup1;

public class _6_Makes10 {
    public static void main(String[] args) {
        /*
        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
         */
        System.out.println(makes10(1,9)); // true;
    }

    public static boolean makes10(int a, int b) {
        int sumAB = a + b;
        if(a == 10 || b == 10 || sumAB == 10){
            return true;
        }
        return false;
    }
}
