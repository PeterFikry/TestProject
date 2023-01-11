package HomeWorkDec182022;

import java.util.Scanner;

public class Loan_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of loan is needed?");

        int amount=input.nextInt();
        if (amount<=200000){
            System.out.println("We will lend you the amount");}
        else {
            System.out.println("Sorry , we can not lend you the loan amount");}
    }
}
