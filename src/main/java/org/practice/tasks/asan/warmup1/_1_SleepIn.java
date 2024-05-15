package org.practice.tasks.asan.warmup1;

public class _1_SleepIn {
    public static void main(String[] args) {
        /*
        The parameter weekday is true if it is a weekday,
        and the parameter vacation is true if we are on vacation.
         We sleep in if it is not a weekday or we're on vacation.
         Return true if we sleep in.
         */
        System.out.println(sleepIn(true, true)); // ture
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == true || weekday == false && vacation == false) {
            return true;
        }
        if (weekday == true && vacation == true) {
            return true;
        }
        return false;
    }

}
