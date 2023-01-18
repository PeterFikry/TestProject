package peterPractice;

import java.util.Arrays;
import java.util.Scanner;

public class peterPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 numbers");
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j < i; j++)
                numbers[i] = scanner.nextInt();
            {

                System.out.println(numbers[i] * 10);
            }


        }

    }
}






































