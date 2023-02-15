package peterPractice;

class Main {
    public static void main(String[] args) {
        int result1 = sub(50, 5, 3, 2);
        int result2 = sub(50, 15, 5);
        int result3 = sub(50, 30);

        System.out.println(result1+" (should come from subtracting 4 numbers)");
        System.out.println(result2+" (should come from subtracting 3 numbers)");
        System.out.println(result3+" (should come from subtracting 2 numbers)");
    }

    static int sub(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    static int sub(int a, int b, int c) {
        return a - b - c;
    }

    static int sub(int a, int b) {
        return a - b;
    }

}