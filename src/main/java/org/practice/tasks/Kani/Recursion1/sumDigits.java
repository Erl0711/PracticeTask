package org.practice.tasks.Kani.Recursion1;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(126));  // 9
        System.out.println(sumDigits(49));  // 13
        System.out.println(sumDigits(12));  // 3

        /*
        Если задано неотрицательное число int n, рекурсивно (без циклов) верните сумму его цифр.
        Обратите внимание, что при умножении (%) на 10 получается крайняя правая цифра (126 % 10 равно 6),
        а при делении (/) на 10 крайняя правая цифра удаляется (126 / 10 равно 12).
         */

    }
    public static int sumDigits(int n) {

        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
}

