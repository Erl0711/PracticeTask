package org.PracticeTasks.Zhyldyz;

public class Task {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("XX"));
        System.out.println(romanToInt("XI"));
        System.out.println(romanToInt("VII"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XXI"));
    }

    public static int romanToInt(String str) {
        int result = 0;
        int prev = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int value = 0;
            char a = str.charAt(i);
            switch (a) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if (value < prev) {
                result -= value;
            } else {
                result += value;
            }
            prev = value;
        }
        return result;
    }
}
