package HomeWorkJan072023;

import java.util.Scanner;

public class Grades_8 {
    public static void main(String[] args) {

        System.out.println("Please Enter Your Grade");
        Scanner scanner = new Scanner(System.in);

        char grade = scanner.next().charAt(0);

        if (grade == 'A' || grade == 'a') {
            System.out.println("You entered grade " + grade + " this means Excellent");

        } else if (grade == 'B' || grade == 'b') {
            System.out.println("You entered grade " + grade + " this means Good");

        } else if (grade == 'C' || grade == 'c') {
            System.out.println("You entered grade " + grade + " this means Average");

        } else if (grade == 'D' || grade == 'd') {
            System.out.println("You entered grade " + grade + " this means Bad");

        } else {
            System.out.println("Not Acceptable");

        }
    }
}