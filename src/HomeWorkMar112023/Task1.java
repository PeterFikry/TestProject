package HomeWorkMar112023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /*
    1) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}