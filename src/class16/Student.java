package class16;

public class Student {
    String name;
    String id;
    static String schoolName;   //we use static variable if we will use the same value in different object of class.
    int age;
    double weight;

    void printName() {
        int SSN=343245545;
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo() {
        //System.out.println(name);  can't access here
        System.out.println(schoolName);
    }
}
