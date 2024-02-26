package org.PracticeTasks.Kani;

public class MakeBricks {
    public static void main(String[] args) {

        MakeBricks  make = new MakeBricks();
        System.out.println(make.makeBricks(3, 1, 8));
        System.out.println(make.makeBricks(3, 1, 9));
        System.out.println(make.makeBricks(3, 2, 10));
    }
    public boolean makeBricks(int small, int big, int goal) {

        if (goal > small + big * 5) {
            return false;
        }
        int smallBricks = goal % 5;

        return smallBricks <= small;
    }

}

