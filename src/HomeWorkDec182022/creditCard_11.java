package HomeWorkDec182022;

import java.util.Scanner;

public class creditCard_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have credit card?");
        boolean creditCard=input.nextBoolean();

        if (creditCard==false){
            System.out.println("We have a great offers for credit card we can issue one for you");}
        else {
            System.out.println("What is balance on the card you have?");}
        int balance=input.nextInt();
        if (balance>1000) {
            System.out.println("Please pay off your balance immediately");}
        else {
            System.out.println("Your balance is good you can spend more");
        }
    }
}
