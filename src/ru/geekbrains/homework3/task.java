package ru.geekbrains.homework3;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Random;

public class task {
    /*task1
    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
      После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void main(String[] args) throws IOException {
        randomNumber();
    }
    public static void randomNumber() throws IOException {
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("Введите число");
        for(int i=0;i<3;i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            if(a<x) System.out.println("Введенное число меньше загаданного");
            if(a>x) System.out.println("Введенное число больше загаданного");
            if(a==x) System.out.println("Вы угадали!");
            if(a==x) break;
        }
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        if(b==1) randomNumber();

    }
}
