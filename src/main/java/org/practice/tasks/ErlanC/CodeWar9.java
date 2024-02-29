package org.practice.tasks.ErlanC;

import java.util.Arrays;
import java.util.stream.IntStream;


public class CodeWar9 {

    /*
    Суммируйте все числа данного массива (cq. list ),
    за исключением самого высокого и самого низкого элемента (по значению, а не по индексу!).
    Самый высокий или самый низкий элемент соответственно - это один элемент на каждом ребре,
    даже если их несколько с одинаковым значением.
    Обратите внимание на проверку вводимых данных.
     */

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
