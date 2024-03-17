package org.practice.tasks.ErlanC.coding_bat;

import java.util.Arrays;

public class SeriesUp {
    /*
    Учитывая n>=0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    (добавлены пробелы, чтобы показать группировку). Обратите внимание,
     что длина массива будет равна 1 + 2 + 3 ... + n, что, как известно, в сумме дает ровно n*(n + 1)/2.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
    }

    public static int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];
        int val = 1;
        for (int i = 0; i < arr.length; ) {
            for (int j = 1; j <= val; j++) {
                if (i < arr.length) {
                    arr[i] = j;
                    i++;
                }
            }
            val++;
        }
        return arr;
    }
}
