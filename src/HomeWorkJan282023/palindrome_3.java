package HomeWorkJan282023;

public class palindrome_3 {
    //3)Create a method that will print whether given String is palindrome or not.

    void isPalindrome (String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();

        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome_3 palindrome3=new palindrome_3();
        palindrome3.isPalindrome("lolo");
    }
}
