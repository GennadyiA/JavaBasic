package ru.geekbrains.homework5;

public class realTask {
    /*
   1 Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
   2 Конструктор класса должен заполнять эти поля при создании объекта.
   3 Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
   4 Создать массив из 5 сотрудников.
   5 С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        */
    public static void main(String[] args) {
        task.Person[] array = new task.Person[5];
        array[0] = new task.Person("Vasya", "Engineer", "vas@box.ru", 804400030,10000,25);
        array[1] = new task.Person("Asya", "Engineer", "las@box.ru", 809458463,10000,35);
        array[2] = new task.Person("Lasya", "Engineer", "kas@box.ru", 809458943,10000,45);
        array[3] = new task.Person("Sasya", "Engineer", "sas@box.ru", 809458943,10000,55);
        array[4] = new task.Person("Nasya", "Engineer", "das@box.ru", 809458321,10000,60);

        for(int i = 0; i<array.length; i++ ){
            if(array[i].age > 40) array[i].personInfo();
        }
    }

    public static class Person{
        String name;
        String position;
        String email;
        int phone;
        int salary;
        int age;

        public Person(String name, String position, String email, int phone, int salary, int age){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        void personInfo(){
            System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
        }
    }
}
