package HomeWorkDec182022;

import java.util.Scanner;

public class PositiveOrNegative_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num+" is a positive Number");
        } else if (num<0) {
            System.out.println(num+" is a negative Number");

        }
    }
}
