package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo8 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Egypt", "Cairo");
        countries.put("USA", "Washington DC");
        countries.put("Austria", "Vienna");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");

        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        var entrySet = countries.entrySet();      //we can use it instead of the previous code
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        var iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

