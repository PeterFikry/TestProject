package HomeWorkFeb192023;

import java.util.ArrayList;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Jeep");
        cars.add("BMW");

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)+" ");
        }
        for (String c:cars){
            System.out.println(c+" ");
        }
    }
}
