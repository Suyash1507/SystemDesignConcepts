package OOPS;

import encapsulation.encapsulationIntro;

public class MainClass {
    public static void main(String[] args) {
//        Person pr = new Person("Suyash",24);
//        pr.displayInfo();
//        pr.eat();
//        pr.walk();
//        pr.walk(10);
//
//        System.out.println("Total Persons created: " + Person.count);
//
//        Person pr2 = new Person("Suyash Keshri",26);
//        pr2.displayInfo();
//        pr2.eat();
//        pr2.walk();
//        pr2.walk(10);
//
//        System.out.println("Total Persons created: " + Person.count);

//        Developer d1 = new Developer("Alex", 30);
//        d1.displayInfo();
//        d1.code();
//        d1.walk(); // overridden method

        encapsulationIntro obj = new encapsulationIntro();
        obj.doWork();


    }
}

class Person{
    String name;
    int age;

    static int count;

    Person(String name, int age){
//        this();
        count++;
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void walk(){
        System.out.println(name + " is walking.");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps.");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }
}

class Developer extends Person{

    Developer(String name, int age) {
        super(name, age); // parent ka constructor call
    }

    void code(){
        System.out.println(name + " is coding.");
    }

    void walk(){
        System.out.println(name + " the developer is walking.");
    }


}