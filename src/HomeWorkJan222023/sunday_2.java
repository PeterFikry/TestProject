package HomeWorkJan222023;

public class sunday_2 {
    public static void main(String[] args) {

        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String str="Sunday";

        StringBuilder stringBuilder=new StringBuilder(str);
        String reversedString=stringBuilder.reverse().toString();

        System.out.println(reversedString);


    }
}
