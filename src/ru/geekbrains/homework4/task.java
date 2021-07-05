package ru.geekbrains.homework4;

import java.util.Random;
import java.util.Scanner;
/*
Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
 */
public class task {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        //проверяем горизонтальные и вертикальные варианты
        for (int i = 0; i < SIZE-1; i++) {
            int hor = 0, ver = 0;
            for (int j = 0; j < SIZE-1; j++) {
                if (map[i][j] == symb) {
                    hor++;
                }
                if (map[j][i] == symb) {
                    ver++;
                }

            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            int hor = 0, ver = 0;
            for (int j = 0; j < SIZE-1; j++) {
                if (map[i][j] == symb) {
                    hor++;
                }
                if (map[j][i] == symb) {
                    ver++;
                }

            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE-1; i++) {
            int hor = 0, ver = 0;
            for (int j = 1; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    hor++;
                }
                if (map[j][i] == symb) {
                    ver++;
                }

            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            int hor = 0, ver = 0;
            for (int j = 1; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    hor++;
                }
                if (map[j][i] == symb) {
                    ver++;
                }

            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) {
                return true;
            }
        }

        //проверяем диагонали
        //простые диагонали
        int diag1 = 0, diag2 = 0, diag3 = 0, diag4 = 0, diag5 = 0, diag6 = 0;
        for (int i = 0; i < SIZE-1; i++) {
            if (map[i][i] == symb) {
                diag1++;
            }
            if (diag1 == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            if (map[i][i] == symb) {
                diag1++;
            }
            if (diag1 == DOTS_TO_WIN) {
                return true;
            }
        }
        //диагонали со сдвигом
        for (int i = 1; i < SIZE; i++) {
                if (map[i][i - 1] == symb) {
                    diag2++;
                }
                if (map[i - 1][i] == symb) {
                    diag3++;
                }
                if ( diag2 == DOTS_TO_WIN || diag3 == DOTS_TO_WIN) {
                    return true;
                }
        }
        //обратные диагонаали
        for (int i = 3, j = 0; i>=0; i--, j++){
            if (map[i][j] == symb) {
                diag4++;
            }
            if (diag4 == DOTS_TO_WIN){
                return true;
            }
        }
        for (int i = 4, j = 0; i>0; i--, j++){
            if (map[i][j] == symb) {
                diag5++;
            }
            if (diag5 == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 3, j = 1; i>=0; i--, j++){
            if (map[i][j] == symb) {
                diag6++;
            }
            if (diag6 == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 4, j = 1; i>0; i--, j++){
            if (map[i][j] == symb) {
                diag6++;
            }
            if (diag6 == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;

    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}