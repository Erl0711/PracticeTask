package org.practice.tasks.ErlanC.CodeWars;

import java.util.Arrays;

public class CodeWar3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12345)));
    }

    /*Преобразовать число в обратный массив цифр

Учитывая случайное неотрицательное число, вы должны вернуть цифры этого числа в массиве в обратном порядке.

     */

    public static int[] digitize(long n) {
        StringBuilder temp = new StringBuilder(String.valueOf(n)).reverse();
        return temp.toString().chars().map(Character::getNumericValue).toArray();
    }
}
