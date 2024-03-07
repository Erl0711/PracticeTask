package org.practice.tasks.ErlanC.CodeWars;

public class CodeWar5 {
    /*

    Рядом с дорогой стоят столбы. Расстояние между столбами одинаковое, а ширина столбов одинаковая.
    Ваша функция принимает три аргумента:

    1. количество столбов (≥ 1);
    2. расстояние между столбами (10 - 30 метров);
    3. ширина стойки (10 - 50 сантиметров).

    Рассчитайте расстояние между первой и последней стойкой в сантиметрах
    (без учета ширины первой и последней стойки).

     */


    public static void main(String[] args) {
        System.out.println(pillars(2,20,25));
    }

    public static int pillars(int numPill, int dist, int width){
        int result = 0;
        for(int i = 1; i < numPill; i++){
            result += ((dist * 100) + width);
        }

        return (numPill == 1) ? result : result - width;
    }
}
