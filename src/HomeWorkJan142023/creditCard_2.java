package HomeWorkJan142023;

import java.util.Scanner;

public class creditCard_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Would you like to get a credit card?");
            String customerReply = scanner.next();
            if (customerReply.equalsIgnoreCase("Yes")) {
            break;
            }

        }
    }
}
