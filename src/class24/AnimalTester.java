package class24;

import HomeWorkFeb042023.A;

public class AnimalTester {
    public static void main(String[] args) {
        //Animal animal=new Animal();

        Animal [] arr={new Cat(),new Dog()};
        for (Animal animal:arr){
            animal.sleep();
            animal.speak();
        }
    }
}
