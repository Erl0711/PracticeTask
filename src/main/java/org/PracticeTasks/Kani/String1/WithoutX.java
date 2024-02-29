package org.PracticeTasks.Kani.String1;

public class WithoutX {
    public static void main(String[] args) {
       WithoutX withoutX = new WithoutX();
        System.out.println(withoutX.withoutX("xHix")); // → "Hi"
        System.out.println(withoutX.withoutX("xHi")); // → "Hi"
        System.out.println(withoutX.withoutX("Hxix") );// → "Hxi"

    }
    /* Учитывая строку, если первый или последний символ равен «x», верните строку без этих символов «x»,
    в противном случае верните строку без изменений.
     */

    public String withoutX(String str) {

        if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1); }
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); }
        return str;
    }

}
