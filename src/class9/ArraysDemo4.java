package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        // create an array to store the letters A B c d e F

        char[] letter = {'A', 'B', 'c', 'd', 'e', 'F'};
        letter[0]='z';                                      //we can do that to update the variable
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);

        }


    }


}

