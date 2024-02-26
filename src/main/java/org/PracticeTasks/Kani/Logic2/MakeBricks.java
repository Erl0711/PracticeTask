package org.PracticeTasks.Kani.Logic2;

public class MakeBricks {
    public static void main(String[] args) {

        MakeBricks  make = new MakeBricks();
        System.out.println(make.makeBricks(3, 1, 8));
        System.out.println(make.makeBricks(3, 1, 9));
        System.out.println(make.makeBricks(3, 2, 10));
    }

    /*
    Мы хотим сделать ряд кирпичей длиной в несколько дюймов.
    У нас есть несколько маленьких кирпичей (по 1 дюйму каждый) и больших кирпичей (по 5 дюймов каждый).
    Возвращайте true, если цель можно достичь, выбрав из заданных кубиков.
    Это немного сложнее, чем кажется, и можно сделать без каких-либо петель.
     */
    public boolean makeBricks(int small, int big, int goal) {

        if (goal > small + big * 5) {
            return false;
        }
        int smallBricks = goal % 5;
        return smallBricks <= small;
    }
}

