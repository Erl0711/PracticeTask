package org.practice.tasks.Gulaiym.String2;
/* Учитывая строку и целое число n,
   верните строку, состоящую из n повторений последних n символов строки.
    Вы можете предположить, что n находится в диапазоне от 0 до длины строки включительно.
       repeatEnd("Hello", 3) → "llollollo"
       repeatEnd("Hello", 2) → "lolo"
       repeatEnd("Hello", 1) → "o"
    */
public class repeatEnd {
    public static void main(String[] args) {
// Примеры использования функции
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n) {
        String d = "";
        for (int i = 0; i < n; i++) {
            d += str.substring(str.length() - n);
        }
        return d;
    }
}
