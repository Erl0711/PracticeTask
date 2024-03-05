package org.practice.tasks.ErlanC.CodeWars;

public class CodeWar12 {

    /*
    Создайте функцию, которая принимает строку и один символ и возвращает целое число,
    равное количеству вхождений, второй аргумент найден в первом.
    Если вхождений найти не удается, должно быть возвращено значение 0.
     */
    public static void main(String[] args) {
        System.out.println(strCount("Hello",'o'));
    }

    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter) count++;

        }
        return count;
    }
}
