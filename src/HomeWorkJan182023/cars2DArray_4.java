package HomeWorkJan182023;

import java.util.Arrays;

public class cars2DArray_4 {
    public static void main(String[] args) {

        String[][] cars = {{"American", "German", "Korean", "Italian"},
                {"JEEP", "BMW", "KIA", "FIAT"}};


        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------OR-----------");

        for (String[] arr : cars) {
            for (String car : arr) {
                System.out.print(car + " ");
            }
            System.out.println();
        }

    }
}
