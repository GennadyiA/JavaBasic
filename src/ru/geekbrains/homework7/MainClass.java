package ru.geekbrains.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] array = new Cat[5];
        array[0] = new Cat("Oleg1",200,false);
        array[1] = new Cat("Oleg2",200,false);
        array[2] = new Cat("Oleg3",200,false);
        array[3] = new Cat("Oleg4",200,false);
        array[4] = new Cat("Oleg5",200,false);
        Plate plate = new Plate(900);
        for (int i=0; i < array.length; i++){
            array[i].eat(plate);
        }
        for (int i=0; i < array.length; i++){
            System.out.println("Кот " + array[i].name + " cыт "+ array[i].satiety);
             }
    }
}