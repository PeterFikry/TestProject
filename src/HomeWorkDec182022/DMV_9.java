package HomeWorkDec182022;

import java.util.Scanner;

public class DMV_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age=input.nextInt();

        if(age>=18){
            System.out.println("We will issue a drivers license for you");}
        else {
            System.out.println("According to your age , would you like to get learner's permit instead of license?");
        }
    }
}
