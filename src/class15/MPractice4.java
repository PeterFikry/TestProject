package class15;


public class MPractice4 {
    /*
    create a method that takes two numbers as parameters and return the larger number
     */


    int LargerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp = new MPractice4();

        System.out.println(mp.LargerNumber(12, 15));
    }
}

