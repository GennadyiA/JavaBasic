package ru.geekbrains.homework6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Барбос");
        dog1.run(150);
        dog1.swim(30);
        Cat cat1 = new Cat("Васька");
        cat1.run(500);
        cat1.swim(20);

        System.out.println("Создано обьектов типа Animal: "+ Animal.count);
        System.out.println("Создано обьектов типа Cat: "+ Cat.catCount);
        System.out.println("Создано обьектов типа Dog: "+ Dog.dogCount);
    }
}
