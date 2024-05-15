package org.practice.tasks.yrysbek.others;

public class PrintInBox {
    public static void printInBox(String str, int xlen, int ylen) {

        for (int y = 1; y <= ylen; y++) {
            for (int x = 1; x <= xlen; x++) {
                if (y == 1 || y == ylen || x == 1 || x == xlen) {
                    System.out.print("#");
                } else if (y == ylen / 2 + 1 && x == xlen / 2 - str.length() / 2 + 1) {
                    System.out.print(str);
                    x += str.length() - 1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("testing");
    }
}