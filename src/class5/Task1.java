package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {



    /* write a program to find the largest number among three distinct numbers using nested if condition
    please use scanner class to take input from user
     */

        int num1 , num2 , num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 3 numbers");
        num1= scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();


        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Number 1 is the largest " + num1);
            }

        }

        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("Number 2 is the largest " + num2);

            }
        }


        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("Number 3 is the largest " + num3);
            }
        }

    }
}

