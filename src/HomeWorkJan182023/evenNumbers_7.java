package HomeWorkJan182023;

public class evenNumbers_7 {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3},
                {10, 11, 12},
                {22, 23, 24}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }

            }

        }
    }
}
