package org.practice.tasks.zhyldyz;

public class Recursion_bunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies<1) return 0;
        return 2+bunnyEars(bunnies-1);
    }
}
