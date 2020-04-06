package ru.geekbrains.homework7;


public class Cat {
    public String name;
    private int appetite;
    public boolean satiety = false;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }
    public void eat(Plate p) {

        p.decreaseFood(appetite, this);
    }
    public void info() {
        System.out.println("satiety: " + this.satiety);

    }
}