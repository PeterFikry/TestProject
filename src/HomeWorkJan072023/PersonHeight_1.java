package HomeWorkJan072023;

import java.util.Random;
import java.util.Scanner;

public class PersonHeight_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in inches");

        int height=input.nextInt();

        if (height<60){
            System.out.println("short");
        } else if (height==60||height<=72) {
            System.out.println("medium");

        }else {
            System.out.println("tall");
        }
    }
}
