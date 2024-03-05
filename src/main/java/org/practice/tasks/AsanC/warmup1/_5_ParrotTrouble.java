package org.practice.tasks.AsanC.warmup1;

public class _5_ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true,8)); // false
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && hour < 7 || talking && hour > 20){
            return true;
        }return false;
    }
}
