package Project24012023;

public class fibonacciSeries_8 {
    public static void main(String[] args) {

        int k = 0, a = 1, b = 1;
        System.out.print("0 1 1 ");
        while (k <= 50) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }

        System.out.println("****Another Way*****");
        int c = 0;
        int d = 1;
        int e;

        for (int i = 1; i <= 10; i++) {

            e = c + d;
            System.out.print(c + " ");
            c = d;
            d = e;

        }
    }
}
