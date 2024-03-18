package org.practice.tasks.UlanT.Codingbat;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(sumDigits(34));
        System.out.println(bunnyEars(23));


    }
    public static int sumDigits(int n) {
        if(n < 10) return n;
        return (n % 10) + sumDigits(n/10);
    }
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return bunnyEars(bunnies -1)+2;
    }

}
