package class28;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("10");

        Object a = new String("some value");
        Object b = new Integer(10);
        Object c = new Scanner(System.in);



        ArrayList name = new ArrayList();         // the old version of Java we don't need to use it actually, no one use it nowadays
        name.add("Peter");
        name.add(10);
        name.add('a');


        for (Object j : name
        ) {
            ((String)j).trim();
        }

    }
}
