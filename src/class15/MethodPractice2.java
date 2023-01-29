package class15;

public class MethodPractice2 {
    //create a method that takes a String reverse it and return the reversed String.
    //call the method reverseStr
    String reverseStr(String input) {
        String newStr = "";
        for (int i = input.length()-1; i >= 0; i--) {
            newStr += input.charAt(i);

        }
        return newStr;
    }

    String reverseStr1(String input) {      //another way
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input) {       //another way
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

}


