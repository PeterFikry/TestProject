package HomeWorkJan242023;

public class NoOfAlphanumeric_2 {
    public static void main(String[] args) {

        /*
        2)Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str = "sfsdfsdTERDCV4656743&*%$#@()";
        System.out.println(str.replaceAll("[^A-za-z0-9]", "").length());

    }
}
