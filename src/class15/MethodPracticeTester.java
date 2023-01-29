package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp=new MethodPractice();
        boolean isEven=mp.isEven(15);

        System.out.println(isEven);
        //call isEven method for the numbers 100 12 20


        boolean isEven1=mp.isEven(100);
        System.out.println(isEven1);


        boolean isEven2=mp.isEven(12);
        System.out.println(isEven2);


        boolean isEven3=mp.isEven(20);
        System.out.println(isEven3);
    }
}
