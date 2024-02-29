package org.PracticeTasks.ErlanC;

public class CodeWar6 {
    /*
    Джеку очень нравится его цифра пять: хитрость здесь в том, что вы должны умножить каждое число на 5,
     увеличенное до количества цифр каждого числа, так, например:
            multiply(3) == 15 # 3 * 5¹
            multiply(10) == 250 # 10 * 5²
     */
    public static void main(String[] args) {
        System.out.println(multiply(3));
        System.out.println(multiply(10));
        System.out.println(multiply(-3));
    }

    public static int multiply(int number) {
        int count = (number < 0) ? String.valueOf(number).substring(1).length() : String.valueOf(number).length();
        return (int) (number * Math.pow(5,count));
    }
}
