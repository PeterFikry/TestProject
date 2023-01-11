package HomeWorkJan072023;

import java.util.Scanner;

public class countryLanguage_7 {
    public static void main(String[] args) {

        System.out.println("Please Enter your Country Name");
        Scanner scanner=new Scanner(System.in);

        String country= scanner.nextLine();

        if (country.equalsIgnoreCase("USA")){
            System.out.println("Your language is English");

        } else if (country.equalsIgnoreCase("Egypt")) {
            System.out.println("Your language is Arabic");

        } else if (country.equalsIgnoreCase("Spain")) {
            System.out.println("Your language is Spanish");

        } else if (country.equalsIgnoreCase("Austria")) {
            System.out.println("Your language is German");

        } else if (country.equalsIgnoreCase("Sudan")) {
            System.out.println("Your language is Arabic");
        }
    }
}
