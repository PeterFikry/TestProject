package Project24012023;

import java.util.Arrays;

public class secondLargestNo_10 {
    public static void main(String[] args) {

        int[] num = {10, 50, 45, 79, 22, 36, 23};
        Arrays.sort(num);               //we use it to sort all the numbers from lowest to highest numbers

        System.out.println("Second highest number is the array is "+num[num.length-2]);

            }

        }
