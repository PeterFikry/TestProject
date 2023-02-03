package class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance); we can't access it because it's private variable we can use it only on the same class of variable
        System.out.println(person.address);     //default we can access it within the same class and the same package only
        System.out.println(person.name);        //public we can access it from anywhere
        person.printTikTokAccount();                //public
        person.printSSN();                         // default
        //person.printPhonePassword();          private we can't access it

    }
}
