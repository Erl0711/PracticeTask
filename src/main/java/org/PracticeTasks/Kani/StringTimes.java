package org.PracticeTasks.Kani;

public class StringTimes {
    public static void main(String[] args) {
        StringTimes stringTimes = new StringTimes();
        System.out.println(stringTimes.stringTimes("Hi", 2));
        System.out.println(stringTimes.stringTimes("Hi", 3));
        System.out.println(stringTimes.stringTimes("Hi", 1));

        // stringTimes("Hi", 2) → "HiHi"
        //stringTimes("Hi", 3) → "HiHiHi"
        //stringTimes("Hi", 1) → "Hi"
    }

    /*
    Учитывая строку и неотрицательное целое число n,
    верните строку большего размера, состоящую из n копий исходной строки.
     */

public String stringTimes(String str, int n) {

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
        result.append(str);
    }
    return result.toString();
}
}
