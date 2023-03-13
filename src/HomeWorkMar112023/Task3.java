package HomeWorkMar112023;

import java.util.Scanner;

public class Task3 {
    /*
    3) Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        try {
            checkAgeEligibility(age);
            System.out.println("You are eligible!");
        } catch (Exception e) {
            System.out.println("Sorry, you are not eligible: " + e.getMessage());
        }
    }

    public static void checkAgeEligibility(int age) throws Exception {
        if (age < 16) {
            throw new RuntimeException("Age must be 16 or above");
        }
    }
}