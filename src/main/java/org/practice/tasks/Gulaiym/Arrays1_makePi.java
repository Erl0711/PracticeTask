package org.practice.tasks.Gulaiym;
public class Arrays1_makePi {
   /* Возвращает массив int длиной 3,
    содержащий первые 3 цифры числа pi, {3, 1, 4}.
    makePi() → [3, 1, 4]*/
   public static void main(String[] args) {
        int[] piDigits = makePi();
        System.out.println("makePi() → [" + piDigits[0] + ", " + piDigits[1] + ", " + piDigits[2] + "]");
    }
    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }
}


