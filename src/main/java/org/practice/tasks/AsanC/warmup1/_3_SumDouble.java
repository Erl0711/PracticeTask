package org.practice.tasks.AsanC.warmup1;

public class _3_SumDouble {
    public static void main(String[] args) {
        /*
        Given two int values, return their sum.
        Unless the two values are the same, then return double their sum.
         */
        System.out.println(sumDouble(2,3));
    }
    public static int sumDouble(int a, int b) {
        if(a == b){
            return 2 * (a + b);
        }
        return a + b;
    }
}
