package class15;

import java.util.Scanner;

public class MethodPractice {
    //create a method which returns true or false and take the int numbers as a parameter if number is
    //even it returns true otherwise it returns false

    boolean isEven(int number) {
        boolean flag;
        if (number % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
    boolean isEven1(int number) {               //another way

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean isEven2(int number){               //another way

        return number%2==0;
    }

}


