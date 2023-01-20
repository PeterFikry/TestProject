package Project24012023;

import java.util.Arrays;

public class sum2DArrays_3 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 4, 6, 8},
                           {3, 5, 7, 9}};

        int sum = 0;
        for (int i = 0; i < 2; i++) {                   // 2 numbers of rows
            for (int j = 0; j < 4; j++)                 // 4 numbers of columns
                sum += numbers[i][j];
        }
        System.out.println(sum);
    }
}








