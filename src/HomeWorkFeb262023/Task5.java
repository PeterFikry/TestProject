package HomeWorkFeb262023;

import java.util.*;

public class Task5 {
    /*
    5)Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {


        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(4);
        numList.add(5);
        numList.add(2);
        numList.add(7);
        numList.add(8);
        numList.add(5);
        numList.add(9);
        numList.add(1);


        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        System.out.println("Sum of all integers: " + sum);
    }
}