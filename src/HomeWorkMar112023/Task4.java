package HomeWorkMar112023;

public class Task4 {
    /*
    4) Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username is less than 5 characters.
     */
    public static void main(String[] args) {
        String username = "abc";

        try {
            checkUserName(username);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkUserName(String username) throws RuntimeException {
        if (username.length() < 5) {
            throw new RuntimeException("Username should be at least 5 characters long");
        }
    }
}
