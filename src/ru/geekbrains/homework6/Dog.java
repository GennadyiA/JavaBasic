package ru.geekbrains.homework6;

public class Dog extends Animal {
    static int dogCount = 0;
    String name;

    public Dog (String name){
        this.name = name;
        dogCount++;
    }
    @Override
    public void run(int a) {
        if(a<=500) System.out.println(name + " пробежал " + a + "м");
        if(a>500) System.out.println(name + " не может пробежать больше 500м");
    }

    @Override
    public void swim(int a) {
        if(a<=10) System.out.println(name + " проплыл " + a + "м");
        if(a>10) System.out.println( name + " не может проплыть больше 10м");
    }
}
