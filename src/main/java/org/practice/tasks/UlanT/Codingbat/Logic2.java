package org.practice.tasks.UlanT.Codingbat;

public class Logic2 {
    public static void main(String[] args) {
        System.out.println(loneSum(3, 3, 8));
        System.out.println(luckySum(3, 12, 13));
    }
    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c){
            return 0;
        } if (a == b){
            return c;
        } if (b == c){
            return a;
        } if (a == c){
            return b;
        } else return a+b+c;
    }
    public static int luckySum(int a, int b, int c) {
        if (a == 13){
            return 0;
        } if (b == 13){
            return a;
        } if (c == 13){
            return a+b;
        } else return a+b+c;
    }
}
