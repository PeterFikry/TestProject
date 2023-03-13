package HomeWorkMar112023;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
    2) Create a static method that will return a List of Exceptions.
    Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
    Call your method inside main and print name and details of all Exception objects.
     */
    public static List<Exception> getExceptionList() {
        List<Exception> exceptionList = new ArrayList<>();

        try {
            int result = 10 / 0;
        } catch (ArithmeticException ae) {
            exceptionList.add(ae);
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException npe) {
            exceptionList.add(npe);
        }

        try {
            int[] arr = new int[3];
            arr[3] = 10;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            exceptionList.add(aioobe);
        }

        try {
            String str = "abc";
            char c = str.charAt(10);
        } catch (StringIndexOutOfBoundsException sioobe) {
            exceptionList.add(sioobe);
        }

        return exceptionList;
    }

    public static void main(String[] args) {
        List<Exception> exceptionList = getExceptionList();

        for (Exception e : exceptionList) {
            System.out.println("Exception Name: " + e.getClass().getSimpleName());
            System.out.println("Exception Details: " + e.getMessage());
        }
    }
}