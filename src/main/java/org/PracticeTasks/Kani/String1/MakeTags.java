package org.PracticeTasks.Kani.String1;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags makeTags = new MakeTags();
        System.out.println(makeTags.makeTags("i", "Yay")); // → "<i>Yay</i>"
        System.out.println(makeTags.makeTags("i", "Hello")); // → "<i>Hello</i>"
        System.out.println(makeTags.makeTags("cite", "Yay") ); // → "<cite>Yay</cite>"
    }

   /* Интернет построен на строках HTML, таких как «<i>Ура</i>», которые отображают «Ура» курсивом.
   В этом примере тег «i» образует <i> и </i>, окружающие слово «Ура». Учитывая строки тегов и слов,
   создайте строку HTML с тегами вокруг слова, например. «<i>Ура</i>».
    */
    public String makeTags(String tag, String word) {
        return "<" + tag +">"+word +"</" + tag +">";
    }
}
