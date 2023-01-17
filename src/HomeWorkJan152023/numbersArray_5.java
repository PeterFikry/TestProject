package HomeWorkJan152023;

public class numbersArray_5 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
