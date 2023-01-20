package Project24012023;

import java.util.Scanner;

public class ScannerCountries_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the country name");
        String[] country = new String[4];
        country[0] = scanner.next();
        country[1] = scanner.next();
        country[2] = scanner.next();
        country[3] = scanner.next();

        for (int i = 0; i < country.length; i++) {
            if (country[i].equalsIgnoreCase("Egypt")) {
                System.out.println("The capital of Egypt is Cairo");
            }
            if (country[i].equalsIgnoreCase("France")) {
                System.out.println("The capital of France is Paris");
            }
            if (country[i].equalsIgnoreCase("Germany")) {
                System.out.println("The capital of Germany is Berlin");

            }
            if (country[i].equalsIgnoreCase("USA")) {
                System.out.println("The capital of USA is Washington");
            }
        }
        System.out.println("**********OR**********");

        for (String s : country) {
            if (s.equalsIgnoreCase("Egypt")) {
                System.out.println("The capital of Egypt is Cairo");
            }
            if (s.equalsIgnoreCase("France")) {
                System.out.println("The capital of France is Paris");
            }
            if (s.equalsIgnoreCase("Germany")) {
                System.out.println("The capital of Germany is Berlin");

            }
            if (s.equalsIgnoreCase("USA")) {
                System.out.println("The capital of USA is Washington");
            }
        }
    }
}

