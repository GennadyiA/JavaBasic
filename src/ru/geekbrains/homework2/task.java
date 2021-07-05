package ru.geekbrains.homework2;

import org.w3c.dom.ls.LSOutput;

public class task {
    /*task1
    Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void invertArray(){
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0;i<array.length;i++){
            if (array[i] == 0 ) array[i]=1;
            else array[i]=0;
        }
    }
    /*task2
    Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0,a = 0; i < arr.length; i++,a+=3) {
            arr[i]=a;
        }
    }
    /*task3
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i]<6) w[i]=w[i]*6;
        }
    }
    /*task4
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
     заполнить его диагональные элементы единицами;
     */
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0 && j%2 ==0)arr[i][j]=1;
                if (i % 2 != 0 && j%2 !=0)arr[i][j]=1;
            }
        }
    }
}
