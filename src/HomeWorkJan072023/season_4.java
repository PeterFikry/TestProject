package HomeWorkJan072023;

import java.util.Scanner;

public class season_4 {
    public static void main(String[] args) {
        System.out.println("Please enter you birt month");
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();

        if (month .equalsIgnoreCase("June") || month .equalsIgnoreCase("July") ||month .equalsIgnoreCase("August")) {
            System.out.println("You were born in Summer");
        } else if (month .equalsIgnoreCase("September") || month .equalsIgnoreCase("October")|| month .equalsIgnoreCase("November")) {
            System.out.println("You were born in Autumn");

        } else if (month .equalsIgnoreCase("December")|| month .equalsIgnoreCase("January")|| month .equalsIgnoreCase("February")) {
            System.out.println("You were born in Winter");

        } else if (month .equalsIgnoreCase("March")|| month .equalsIgnoreCase("April") || month .equalsIgnoreCase("May")) {
            System.out.println("You were born in Spring");
        } else {
            System.out.println("Wrong Entry");
        }
    }
}