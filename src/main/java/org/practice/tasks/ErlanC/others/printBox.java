package org.practice.tasks.ErlanC.others;

public class printBox {
    public static void main(String[] args) {
        System.out.println(getBox("Hello", 10, 7));
    }


    public static boolean getBox(String str, int xlen, int ylen) {

        System.out.println("Erlan");

        for (int y = 0; y < ylen; y++) {
            for (int x = 0; x < xlen; x++) {
                if (y == 0 || y == ylen - 1) {
                    System.out.print("#");
                } else if(x == 0 || y != ylen - 1 && x == xlen - 1){
                    System.out.print("#");
                } else if (y == (ylen / 2)  && x == (xlen / 2) - str.length() / 2){
                    System.out.print(str);
                    x+= str.length() - 1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return false;
    }

}