package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        Scanner => Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in => tells the computer we want to read the data from keyboard
         */

      /*  System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("Your are "+ age+ " Years old");*/

      /*  System.out.println("Please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("your weight is "+weight+" Pounds");*/

      /*  System.out.println("Are you hungry?");
        boolean hungry= scan.hasNextBoolean();
        System.out.println("Hungry "+hungry);*/


       /* System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);     // very important line charAt(0) means only first character
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please Enter your name");
        String name=scan.next(); // when we have to take only one word as input we use .next
        System.out.println("Your name is "+name);

        scan.nextLine(); // Trick to make nexLine method work after we have used any other method from Scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); //Good practice

    }
}
