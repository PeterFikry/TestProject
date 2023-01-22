package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        // only converts the uppercase letters to lowercase
        String str = "JAVA is FUN 1232@#$";
        String newStr = str.toLowerCase();
        System.out.println(newStr);

        // converts the lowercase letters to uppercase
        String str2 = "i love java";
        String newStr2 = str2.toUpperCase();
        System.out.println(newStr2);

    }
}
