package HomeWorkFeb262023;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    /*
    2) Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
     */
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void userDetails() {
        System.out.println("Name is : " + name + " , Lastname is : " + lastName + " ,age is : " + age + " ,salary is : " + salary);
    }
}

class PersonTester {
    public static void main(String[] args) {
        TreeMap<Integer, Person> personMap = new TreeMap<>();
        Person person1 = new Person("Justin", "Ghobrial", 6, 200000);
        personMap.put(1, person1);
        Person person2 = new Person("Jason", "Ghobrial", 3, 150000);
        personMap.put(2, person2);
        Person person3 = new Person("Jianna", "Ghobrial", 1, 100000);
        personMap.put(3, person3);

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            int personId = entry.getKey();
            Person person = entry.getValue();
            System.out.println("Person ID: " + personId);
            person.userDetails();
        }
    }
}
