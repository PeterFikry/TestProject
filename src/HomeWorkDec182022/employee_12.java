package HomeWorkDec182022;

import java.util.Scanner;

public class employee_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of years you worked in");
        int years = input.nextInt();

        if (years >= 5) {
            System.out.println("sounds good, you are eligible for bonus");
            System.out.println("Please enter your salary");
        } else {
            System.out.println("sorry, you are not eligible for bonus");
        }

        int salary = input.nextInt();

        if (salary > 50000) {
            System.out.println("Congratulations , you will get $5000 bonus");
        } else if (salary < 50000) {
            System.out.println("Congratulations , you will get $3000 bonus");
        }


    }

}





