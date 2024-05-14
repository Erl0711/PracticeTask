package org.practice.tasks.asan.warmup2;

public class StringTimes {
    public static void main(String[] args) {
        /*
        Given a string and a non-negative int n,
        return a larger string that is n copies of the original string.
         */
        System.out.println(stringTimes("Asan", 3));
    }

    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    /*В этом коде:
repeatString - это статический метод, который принимает два параметра:
str (строка для повторения) и n (количество повторений строки).
 Внутри метода используется StringBuilder для эффективного построения повторяющейся строки.
Метод добавляет в StringBuilder входную строку n раз.
Наконец, он возвращает строковое представление StringBuilder.
В методе main показано, как использовать метод repeatString,
чтобы повторить строку определенное количество раз.
     */
}
