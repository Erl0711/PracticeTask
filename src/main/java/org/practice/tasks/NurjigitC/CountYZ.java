package org.practice.tasks.NurjigitC;

public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
    }

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        if (str.endsWith("z") || str.endsWith("y")) {
            count++;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') &&
                    !(Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        return count;
    }
}
