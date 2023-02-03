package HomeWorkJan292023;
/*
   Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
   Method should be available inside the class only where it was declared and executed by calling it is name.
    */
public class Task_3 {
    private static String getVowelsOnly(String inputStr) {
        return inputStr.replaceAll("[^AEIOUYaeiouy]", "");
    }

    public static void main(String[] args) {
        System.out.println(getVowelsOnly("Paula"));
    }
}