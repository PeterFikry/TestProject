package HomeWorkJan182023;

public class numbersSum_6 {
    public static void main(String[] args) {

        int[][] numbers = {{5, 6, 7},
                {2, 3, 4}};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++)
                sum += numbers[i][j];
        }
        System.out.println(sum);


    }
}

