package org.PracticeTasks.AsanC.warmup1;

public class _1_SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(true,true)); // ture
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false && vacation == true || weekday == false && vacation == false){
            return true;
        }if(weekday == true && vacation == true){
            return true;
        }
        return false;
    }

}
