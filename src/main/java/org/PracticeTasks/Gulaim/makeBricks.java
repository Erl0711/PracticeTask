package org.PracticeTasks.Gulaim;

public class makeBricks {
    public static void main(String[] args) {
        makeBricks make = new makeBricks();
        System.out.println(make.makeBricks(3, 1, 8));
        System.out.println(make.makeBricks(3, 1, 9));
        System.out.println(make.makeBricks(3, 2, 10));
    }

    public boolean makeBricks(int small, int big, int goal) {
        //8   :5>= 1
        if (goal > small + big * 5) {
            return false;
        }
        int smallBricks = goal % 5;

        return smallBricks <= small;
    }
}