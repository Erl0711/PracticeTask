package org.practice.tasks.Baha;
import java.util.ArrayList;
import java.util.List;


public class Fibonacci {

    private static final List<Integer> fib = new ArrayList<>();

    /* Нужно написать метод, который возвращает количество фибоначи чисел */

    public static void main(String[] args) {
    fibonacci(10).forEach(System.out::println);

    }
    public static List<Integer> fibonacci(int num){
        int old = 0;
        int start = 1;
        int result = 0;
        for(int i = 0; i<num;i++){
            result = result + old;
            old = start;
            start = result;
            fib.add(result);
        }
        return fib;
    }
}
