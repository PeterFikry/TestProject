package HomeWorkFeb192023;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("beer");
        drinks.add("wine");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("e") || drinks.contains("a")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}