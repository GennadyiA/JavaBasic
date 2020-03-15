package ru.geekbrains.lesson1;

public class task8 {
    public static void year(int a){
        if(a%4!=0 || a%100==0 && a%400!=0) System.out.println(a + " год обычный");
        else System.out.println(a + " год високосный");
    }
}
