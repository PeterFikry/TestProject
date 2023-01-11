package HomeWorkDec182022;

import java.util.Scanner;

public class IfElseHomeWork_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a diploma?");
        boolean diploma = input.nextBoolean();

        if (diploma == true) {
            System.out.println("Congratulations!");
        } else if (diploma == false) {
            System.out.println("We suggest to get a degree");
            System.out.println("Do you have a degree?");
        }
        boolean degree = input.nextBoolean();

        if (degree==true){
            System.out.println("What is your gpa score?");}

        double gpa=input.nextDouble();

        if (gpa>3.5) {
            System.out.println("You are eligible for scholarship");}
        else {
            System.out.println("You should have studied harder");
        }
        }


    }


