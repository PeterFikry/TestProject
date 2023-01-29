package class15;

public class MPractice6 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail = new String();

    String userName() {
        return "John";
    }

    String lastName() {
        return "Snow";
    }

    String emailType() {
        return "Gmail";
    }

    String createEmail(String userName, String lastName, String emailType) {        //another way
        return userName + lastName + "@" + emailType + ".com";

    }
}



