package Project24012023;

import java.util.Scanner;

public class intArray_1 {
    //Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 6 numbers");
        int[] num = new int[6];
        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        num[2] = scanner.nextInt();
        num[3] = scanner.nextInt();
        num[4] = scanner.nextInt();
        num[5] = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);

    }
}

