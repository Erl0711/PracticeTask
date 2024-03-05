package org.practice.tasks.AsanC.warmup1;

public class _2_MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,true));  // true
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }return false;
    }
}
