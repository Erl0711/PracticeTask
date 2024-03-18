package org.practice.tasks.ErlanC.coding_bat;

public class LinearIn {

    /*
    Учитывая два массива целых чисел, отсортированных в порядке возрастания, внешний и внутренний,
     верните значение true, если все числа во внутреннем отображаются во внешнем.
      Лучшее решение выполняет только один "линейный" проход по обоим массивам, используя тот факт,
       что оба массива уже отсортированы по порядку.
     */

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 3}, new int[]{}));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int innerInd = 0;
        int count = 0;
        for (int i = 0; i < outer.length; i++) {
            if (inner.length != 0 && outer[i] == inner[innerInd]) {
                count++;
                innerInd++;
            }
            if (count == inner.length) return true;
        }
        return false;
    }
}
