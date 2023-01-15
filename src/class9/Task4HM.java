package class9;

import java.util.Scanner;

public class Task4HM {
    public static void main(String[] args) {

        /*
        4) Write a program to ask a user to enter item they want to buy and the price of that item.
        User will be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */

      // Break down this problem into 4 to 5 steps that we can write the code for and can test those independently
        Scanner scanner=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and its price");
            String itemName=scanner.next();
            double itemPrice=scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if (amountPaid>totalPrice){
            double change=amountPaid-totalPrice;     // Calculating the change
            System.out.println("Hey here is your change "+change);
        } else if (amountPaid<totalPrice) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");



    }
}
