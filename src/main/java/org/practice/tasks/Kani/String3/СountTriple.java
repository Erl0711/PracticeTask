package org.practice.tasks.Kani.String3;

public class СountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc")); // Вывод: 1
        System.out.println(countTriple("xxxabyyyycd")); // Вывод: 3
        System.out.println(countTriple("a")); // Вывод: 0

    }

    /*Мы скажем, что «тройка» в строке — это символ, встречающийся три раза подряд.
    Возвращает количество троек в заданной строке. Тройки могут перекрываться.
     */
    public static int countTriple(String str) {
        int count = 0;

        for(int i = 0; i <= str.length() - 3; i++) {
            if(str.charAt(i) == str.charAt(i+1) &&
                    str.charAt(i) == str.charAt(i+2))
                count++;
        }
        return count;
    }
}
