package org.practice.tasks.UlanT.Codingbat;

public class String2 {
    public static String doubleChar(String str) {
        int count = 0;
        String doubled = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(count);
            doubled += ch;
            doubled += ch;
            count++;
        }
        return doubled;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'h') && (str.charAt(i + 1) == 'i')) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        if (cat == dog) return true;
        else return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

}
