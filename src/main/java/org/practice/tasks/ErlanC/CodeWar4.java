package org.practice.tasks.ErlanC;

import java.util.Arrays;

public class CodeWar4 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,-3,5,6}));
    }

    /*
    Вы получаете массив чисел, возвращаете сумму всех положительных значений.
     */

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(s->s > 0).sum();
    }
}
