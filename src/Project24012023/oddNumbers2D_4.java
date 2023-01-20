package Project24012023;

public class oddNumbers2D_4 {
    public static void main(String[] args) {

        int[][] numbers = {{10, 11, 12, 13, 14, 15},
                           {16, 17, 18, 19, 20, 21}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }


            }

        }
    }
}
