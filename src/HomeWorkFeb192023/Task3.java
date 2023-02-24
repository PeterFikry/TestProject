package HomeWorkFeb192023;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task3 {
    public static void main(String[] args) {

        ArrayList <String> words=new ArrayList<>();
        words.add("Car");
        words.add("Building");
        words.add("Tree");
        words.add("Animal");
        words.add("Plane");

        for (int i = 0; i < words.size(); i++) {
            String word= words.get(i);
            if (word.endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
