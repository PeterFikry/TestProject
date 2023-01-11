package class6;

public class classTasks {
    public static void main(String[] args) {
        // write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50

        System.out.println("----------------------------");

        int number3 = 1;
        while (number3 <= 100) {
            System.out.println(number3);
            number3++;
        }
        System.out.println("----------------------------");

        int number4 = 1;
        while (number4 <= 15) {
            System.out.println(number4);
            number4 += 2;
        }
        System.out.println("----------------------------");

        int number5 = 5;
        while (number5 <= 50) {
            System.out.println(number5);
            number5 += 5;
        }
    }
}

