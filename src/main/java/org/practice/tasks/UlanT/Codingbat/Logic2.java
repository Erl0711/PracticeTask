package org.practice.tasks.UlanT.Codingbat;

public class Logic2 {
    public static void main(String[] args) {
        System.out.println(loneSum(3, 3, 8));
        System.out.println(luckySum(3, 12, 13));
        System.out.println(roundSum(25, 36, 64));
        System.out.println(closeFar(2, 3, 6));
        System.out.println(blackjack(20, 23));
        System.out.println(evenlySpaced(2,4,6));
        System.out.println(makeChocolate(2,5,9));
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        } else return a + b + c;
    }

    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else return a + b + c;
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 >= 5)
            return ((num / 10) * 10) + 10;
        else
            return ((num / 10) * 10);
    }

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - c) < 2) {
            return false;
        } else if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 || Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2) {
            return true;
        } else return false;
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (21 - a > 21 - b) {
            return b;
        } else return a;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        if (a == b || b == c || a == c) {
            return false;
        }
        if (Math.abs(a - b) == Math.abs(b - c)) {
            return true;
        }
        if (Math.abs(a - b) == Math.abs(a - c)) {
            return true;
        }
        if (Math.abs(a - c) == Math.abs(b - c)) {
            return true;
        }
        return false;
    }
    public static int makeChocolate(int small, int big, int goal) {
        while (goal >= 5 && big > 0) {
            goal -= 5;
            big--;
        }
        if (goal <= small)
            return goal;
        else return -1;
    }

}
