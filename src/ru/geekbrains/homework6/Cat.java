package ru.geekbrains.homework6;

public class Cat extends Animal {
    static int catCount = 0;
    String name;

    public Cat (String name){
        this.name = name;
        catCount++;
    }
    @Override
    public void run(int a) {
        if(a<=200) System.out.println(name + " пробежал " + a + "м");
        if(a>200) System.out.println(name + " не может пробежать больше 200м");
    }

    @Override
    public void swim(int a) {
        if(a > 0) System.out.println(name + " не умеет плавать");
    }

}

