package org.practice.tasks.AsanC.warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,true));  // true
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == true && bSmile == true || aSmile == false && bSmile == false){
            return true;
        }return false;
    }
}
