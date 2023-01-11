package peterPractice;

import java.util.Scanner;

public class peterPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter words numbers and two numbers");
        String word1 = input.nextLine();
        String word2=input.nextLine();
        int num1= input.nextInt();
        int num2= input.nextInt();


        if (num1==num2&&word1.equals(word2)){
            System.out.println("AND");
        } else if (num1==num2||word1.equals(word2)) {
            System.out.println("OR");
        }else if (num1!=num2&&!word1.equals(word2)){
            System.out.println("NONE");
        }
    }
}













