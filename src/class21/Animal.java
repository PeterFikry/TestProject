package class21;

public class Animal {
    String name;
    String color="Black";

}

class Cat extends Animal {
    String color="White";
    int age;
    double weight;
    void printColor(){
      String color="Blue";

        System.out.println(color);          //color in the same class
        System.out.println(this.color);     //color in child class
        System.out.println(super.color);    //color in parent class
    }
}

