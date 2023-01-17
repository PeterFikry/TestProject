package HomeWorkJan142023;

import java.util.Scanner;

public class itemAndPrice_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please Enter the name of item and it's price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the total amount that you have to pay " + totalPrice);
        }
        System.out.println("Please pay for the items you bought");
        double amountPaid = scanner.nextDouble();
        if (amountPaid == totalPrice) {
            System.out.println("Thanks for shopping");
        } else if (amountPaid < totalPrice) {
            System.out.println("You can't buy all the items");
        } else {
            System.out.println("Here is your change " + (amountPaid - totalPrice));
        }
    }


}

