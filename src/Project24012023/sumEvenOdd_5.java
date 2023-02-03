package Project24012023;

public class sumEvenOdd_5 {

    //Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.
    public static void main(String[] args) {

        int[][] numbers = {{10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21}};

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 6; j++)
                if (numbers[i][j] % 2 == 0)
                    sumEven = sumEven + numbers[i][j];

        }
        System.out.println("sum of even numbers is " + sumEven);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 6; j++)
                if (numbers[i][j] % 2 != 0)
                    sumOdd = sumOdd + numbers[i][j];
        }

        System.out.println("sum of odd numbers is " + sumOdd);


    }
}
