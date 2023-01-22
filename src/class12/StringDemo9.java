package class12;

public class StringDemo9 {
    public static void main(String[] args) {


        String str="dsfbxkohfu 3453455352 *&%$#";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))){         //to know how many letter do we have
                counter++;
            }
        }
        System.out.println("Total Alphabetic in Str "+counter);
    }
}
