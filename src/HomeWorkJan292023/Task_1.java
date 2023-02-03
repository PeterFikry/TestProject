package HomeWorkJan292023;

public class Task_1 {
    /*
    Create a method that will accept an array as parameters and will return
    a sum of all elements from that array. Method should be visibly only
    within same package and accessible by the creating an instance of the class.
     */


    int sumArray(int[] array) {

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 28, 567, 76};
        Task_1 task_1 = new Task_1();
        System.out.println(task_1.sumArray(arr));
    }
}
