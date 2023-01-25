package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kJKDFHadfjdakfhe324345$%@&%)(*@";
        //Replaces all uppcase letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        //Replaces all lowercase letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //Replaces all numbers from 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        //Replaces all uppercase & lowercase letters from a to z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //Replaces all uppercase & lowercase letters from a to z & numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        //Do not replace all uppercase & lowercase letters from a to z & numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        // to remove we use below
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
    }
}
