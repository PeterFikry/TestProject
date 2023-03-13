package class33;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");

        //here we put the code which might throw an error
        //System.out.println(10 / 0);
        String str = "Java";
        str.charAt(10);

        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
    }
}
