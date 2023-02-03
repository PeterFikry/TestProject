package Project24012023;

public class MaxMin_9 {
    //Maximum and minimum number in the array?
    public static void main(String[] args) {

        int[] num = {10, 20, 35, 65, 70, 80, 95};
        int max = num[6];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] >= max) {
                max = num[i];
            }
        }
        System.out.println("Maximum number is " + max);

        for (int j = 0; j < num.length; j++) {
            if (num[j] == min) {
                min = num[j];
                System.out.println("Minimum number is " + min);
            }

        }

    }
}

