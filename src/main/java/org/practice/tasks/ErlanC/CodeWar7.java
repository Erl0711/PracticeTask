package org.practice.tasks.ErlanC;

import java.sql.Array;

public class CodeWar7 {
    /*
    Создайте функцию, которая возвращает CSV-представление двумерного числового массива.
     */

    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][]{
                        {0, 1, 2, 3, 45},
                        {10, 11, 12, 13, 14},
                        {20, 21, 22, 23, 24},
                        {30, 31, 32, 33, 34}
                }
        ));

        String expected = "0,1,2,3,45\n" +
                "10,11,12,13,14\n" +
                "20,21,22,23,24\n" +
                "30,31,32,33,34";
    }

    public static String toCsvText(int[][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array.length - 1 && j == array[i].length - 1) {
                    result += array[i][j];
                } else if (j == array[i].length - 1) {
                    result += array[i][j] + "\n";
                } else {
                    result += array[i][j] + ",";
                }
            }
        }
        return result;
    }
}
