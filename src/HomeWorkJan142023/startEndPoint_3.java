package HomeWorkJan142023;

import java.util.Scanner;

public class startEndPoint_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers start and end point");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Start " + num1 + " End " + num2);

        int evenSum = 0;
        int oddSum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;

            }
        }
        System.out.println("Sum of all even numbers is "+evenSum);
        System.out.println("Sum of all odd numbers is "+oddSum);

    }
}

