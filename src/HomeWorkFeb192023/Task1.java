package HomeWorkFeb192023;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class Task1 {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Fady");
        names.add("Peter");
        names.add("Paula");
        names.add("Justin");
        names.add("Jason");

        System.out.println(names);

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Peter"));

        System.out.println(names.size());
    }
}
