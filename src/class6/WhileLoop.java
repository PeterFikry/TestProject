package class6;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 0;
        if (number < 3) {
            System.out.println("Hello World");
        }

        number++;
        if (number < 3) {
            System.out.println("Hello World");
        }

        number++;
        if (number < 3) {
            System.out.println("Hello World");
        }


        int number2=0;                      //same thing but with using loop , keeps on checking the condition as long as it returns true
        while (number2<10){
            System.out.println("Hello World");
            number2++;                    // increments the number2 by 1
        }



    }
}
