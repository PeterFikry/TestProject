package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }
    void eat (){
        System.out.println("all the animal eat");
    }
}
class Cat extends Animal{
    //we are overriding speak method in cat class
    void speak() {
        super.speak();                                  // if I also want to print speak value from parent class
        System.out.println("Meow Meow ..........");     // if I want to print speak value from cat only
    }
    void printName(){
        System.out.println(name);
    }
}

class Dog extends Animal{

}

class Tester{


    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}