package org.practice.tasks.ErlanC;

import java.util.Arrays;

public class CodeWar1 {
    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
        System.out.println(sortDesc(145263 ));
        System.out.println(sortDesc(42145 ));
    }

    /*
     * Ваша задача - создать функцию, которая может принимать любое неотрицательное целое число в качестве аргумента
     *  и возвращать его с цифрами в порядке убывания.
     * По сути, переставьте цифры, чтобы получить максимально возможное число.
     */

    public static int sortDesc(final int num) {
        String[] arr = String.valueOf(num).split("");
        String temp = "";
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
        }
        return Integer.parseInt(temp);
    }
}
