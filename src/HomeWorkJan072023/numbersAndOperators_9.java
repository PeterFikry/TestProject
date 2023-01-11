package HomeWorkJan072023;

import java.util.Scanner;

public class numbersAndOperators_9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scanner.nextInt();
        System.out.println("Please enter one operator (+,-,*,/)");
        char operator=scanner.next().charAt(0);
        System.out.println("Please enter second number ");
        int num2= scanner.nextInt();

        if (operator=='+'){
            System.out.println("Result is "+(num1+num2));
        }else if (operator=='-'){
            System.out.println("Result is "+(num1-num2));
        } else if (operator=='*') {
            System.out.println("Result is "+(num1*num2));

        } else if (operator=='/') {
            System.out.println("Result is "+(num1/num2));

        }

    }
}
