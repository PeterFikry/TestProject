package class21;

public class Task3 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void method(String str1) {
        System.out.println("Method with one String");
    }

    private void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    private void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();             //we call it by the name of class because it's not static
        task3.method("Java");
        task3.method("Python","Java");
    }
}


