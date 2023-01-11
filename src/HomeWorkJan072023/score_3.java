package HomeWorkJan072023;

import java.util.Scanner;

public class score_3 {
    public static void main(String[] args) {
        System.out.println("Please enter your three scores");
        Scanner input = new Scanner(System.in);
        int quiz = input.nextInt();
        int midTerm = input.nextInt();
        int finalScores = input.nextInt();

        int total = quiz + midTerm + finalScores;

        if (total >= 90) {
            System.out.println("grade=A");
        } else if (total >= 70 && total < 90) {
            System.out.println("grade=B");

        } else if (total >= 50 && total < 70) {
            System.out.println("grade=C");

        } else {
            System.out.println("grade=F");

        }
    }
}