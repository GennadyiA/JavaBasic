package ru.geekbrains.homework6;

public abstract class Animal {
    static int count = 0;
    public Animal(){
        count++;
    }
    public abstract void run(int a);
    public abstract void swim(int a);
}
