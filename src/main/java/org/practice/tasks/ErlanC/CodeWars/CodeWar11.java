package org.practice.tasks.ErlanC.CodeWars;

import java.util.Arrays;

public class CodeWar11 {

    /*
    Это вопрос от codingbat
    Учитывая целое число n, большее или равное 0, создайте и верните массив со следующим шаблоном:
    squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
    squareUp(2) => [0, 1, 2, 1]
    squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArr(4)));
        System.out.println(Arrays.toString(getArr(3)));
        System.out.println(Arrays.toString(getArr(2)));
    }

    public static int[] getArr(int len){
        int count = 4;

        int[] result = new int[len * len];
        int ss = 1;
        int n = 0;
        for (int i = 0; i < result.length; i+=len) {
            for (int j = (i+len)-1; j >= (i+len)- 1 - n; j--) {
                result[j] = ss;
                ss++;
            }
            n++;
            ss = 1;
        }
        return result;
    }
}
