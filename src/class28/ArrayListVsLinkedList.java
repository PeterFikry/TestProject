package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        //LinkedList => 48 ms
        //ArrayList => 68738ms
        long startTime=System.currentTimeMillis();          //to check start time

        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,"Test Data");
        }
        long endTime=System.currentTimeMillis();        //to check end time
        System.out.println(endTime-startTime);          //to calculate the time the loop is taken
    }
}
