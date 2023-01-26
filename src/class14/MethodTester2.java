package class14;

public class MethodTester2 {
    public static void main(String[] args) {

        // creating an object of the class
        MethodDemo2 md = new MethodDemo2();
        md.printHello();     //calling method

        md.printHelloManyTimes(15);

        md.printManyTimes(5, "I Love Java");
    }
}
