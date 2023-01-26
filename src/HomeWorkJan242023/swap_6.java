package HomeWorkJan242023;

public class swap_6 {
    public static void main(String[] args) {
        //How would you swap 2 strings without a temporary variable?

        String a = "Hello";
        String b = "Ashgar";
        System.out.println("Strings before swap: a = " + a + " and b = " + b);
        a = a + b;

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println("Strings before swap: a = " + a + " and b = " + b);
    }
}

