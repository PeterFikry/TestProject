package HomeWorkFeb262023;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    /*
    4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
      Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("hello");
        stringSet.add("world");
        stringSet.add("java");
        stringSet.add("programming");
        StringBuilder sb = new StringBuilder();
        for (String str : stringSet) {
            sb.append(str);
        }
        String concatenatedString = sb.toString();

        System.out.println(concatenatedString);
    }
}
