package ru.geekbrains.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, Cat cat) {
        if (food - n >= 0) {
            food -= n;
            cat.satiety = true;
        }
        else System.out.println("Недостаточно еды");
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
