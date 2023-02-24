package HomeWorkFeb192023;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Task5 {
    public static void main(String[] args) {

        ArrayList <Integer> evenNumber=new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumber.add(i);
        }

        for (int i = evenNumber.size() - 1; i >= 0; i--) {
            if (evenNumber.get(i) % 5 == 0) {
                evenNumber.remove(i);
            }
        }

        System.out.println(evenNumber);
    }
}