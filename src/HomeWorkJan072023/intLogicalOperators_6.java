package HomeWorkJan072023;

import java.util.Scanner;

public class intLogicalOperators_6 {
    public static void main(String[] args) {

        System.out.println("Please Enter Three Numbers");
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);

        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);

        }
    }
}
