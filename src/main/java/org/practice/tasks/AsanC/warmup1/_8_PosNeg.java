package org.practice.tasks.AsanC.warmup1;

public class _8_PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(1,-4,false));  // true
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if(a > 0 && b < 0 && !negative ||a < 0 && b > 0 && !negative || a < 0 && b < 0 && negative){
            return true;
        }return false;
    }
}
