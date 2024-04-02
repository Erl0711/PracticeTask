package org.practice.tasks.NurjigitC;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        String str1 = "is";
        String str2 = "not";
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals(str1)) {
                countIs++;
            } else if (str.substring(i, i + 3).equals(str2)) {
                countNot++;
            }
        }
        if (str.length() >= 2 && str.substring(str.length() - 2).equals(str1)) {
            countIs++;
        }
        return countNot == countIs;
    }
}
