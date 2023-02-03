package HomeWorkJan302023;

public class Task_1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    String name;
    int age;

    Task_1() {
    }

    Task_1(String customerName, int customerAge) {
        name = customerName;
        age = customerAge;
    }

    void printInfo() {
        System.out.println("Name: " + name + "Age: " + age);
    }

}
