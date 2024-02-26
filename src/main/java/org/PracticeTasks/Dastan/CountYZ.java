package org.PracticeTasks.Dastan;

public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("Dastan"));
        System.out.println(countYZ("Hey Bizz"));
        System.out.println(countYZ("Z Y"));
    }

    public static int countYZ(String str) {
        int num = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length()-1; i++){
            if(!Character.isLetter(str.charAt(i+1))){
                if(str.charAt(i)=='y' || str.charAt(i)=='z'){
                    num++;
                }
            }
        }
        if(str.endsWith("z") || str.endsWith("y")){
            num++;
        }
        return num;
    }
}
