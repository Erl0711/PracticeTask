package org.PracticeTasks.zhyldyz;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("hdjhoirb"));
        System.out.println(disemvowel("yuiyiuyr"));
    }
    public static String disemvowel(String str) {
        String newWord = "";
        for (int i = 0; i < str.length(); i++) {
            char str2 = str.charAt(i);
            if (!(str2 == 'a' || str2 == 'e' || str2 == 'y' || str2 == 'u' || str2 == 'i' || str2 == 'o' || str2 == 'A' || str2 == 'E' || str2 == 'Y' || str2 == 'U' || str2 == 'I' || str2 == 'O')) {
                newWord += str2;
            }
        }
        return newWord;
    }
}
