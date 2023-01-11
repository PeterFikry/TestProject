package class6;

public class WhileLoop6 {
    public static void main(String[] args) {



       /* boolean condition = true;
        int number=0;
        while (condition) {
            System.out.println("Hello world");
            if (number>3){                  //system will print out the same message until we change the condition to false
                condition=false;}
            number++; */


        int number = 0;
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println("Even " + number);
            }
            number++;

        }


    }
}


