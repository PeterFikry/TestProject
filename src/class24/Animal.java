package class24;

import HomeWorkFeb042023.A;

public abstract class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak eat methods
     */

    abstract void speak();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours a day");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Meow Meow");
        }

    }
