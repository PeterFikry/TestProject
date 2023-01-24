package HomeWorkJan222023;

import java.util.Scanner;

public class babyNames_3 {
    public static void main(String[] args) {

        /*
        3)Write a program that reads two people's first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
        Example Output: Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output: Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Dad's first name");
        String dadName = scanner.next();
        System.out.println("Please enter Mom's first name");
        String momName = scanner.next();
        System.out.println("Are you expecting boy or girl?");
        String gender = scanner.next();

        String boyName = dadName.substring(0,3) + momName.substring(2,4);
        String girlName = momName.substring(0, 2) + dadName.substring(3, 6);

        boyName = boyName.toUpperCase();
        girlName = girlName.toUpperCase();

        if (gender.equalsIgnoreCase("Boy")) {
            System.out.print(boyName);
        }
        if (gender.equalsIgnoreCase("Girl")) {
            System.out.println(girlName);
        }
    }
}
