package HomeWorkJan072023;

import java.util.Scanner;

public class doubleLogicalOperators_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Please enter three double numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);

        }

    }
}
