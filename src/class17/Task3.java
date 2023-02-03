package class17;

public class Task3 {
    public static void main(String[] args) {


    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.

     return type=> String
     name=> getOnlyVowels           vowels letter : a e i o u y /   A E I O U Y
     parameters=> String inputStr
     */


        System.out.println(getOnlyVowels("Java"));


    }

    private static String getOnlyVowels(String inputStr) {
        return inputStr.replaceAll("[^AEIOUYaeiouy]", "");


    }


}
