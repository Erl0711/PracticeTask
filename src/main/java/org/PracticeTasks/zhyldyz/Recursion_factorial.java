package org.PracticeTasks.zhyldyz;

public class Recursion_factorial {
    public int factorial(int n) {
        if(n<2) return n;
        return factorial(n-1)*n;
    }
}
