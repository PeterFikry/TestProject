package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "Java is love";
        char c = str.charAt(2);
        System.out.println(c);      // if we want to print specific letter

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));      //if we want to print all letters
        }
        int counter = 0;                            // if we want to check how many 'a' we have
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
