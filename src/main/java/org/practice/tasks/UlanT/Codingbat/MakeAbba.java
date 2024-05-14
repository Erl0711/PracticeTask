package org.practice.tasks.UlanT.Codingbat;

public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Salam", "Karakol"));
    }

    public static String makeAbba(String a, String b) {
        return a + b +b + a;
    }
}