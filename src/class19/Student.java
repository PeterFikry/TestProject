package class19;

public class Student {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student (String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" and address is "+address);
    }

    public static void main(String[] args) {
        Student student=new Student("Peter","12321 Virginia st. ,Fairfax,VA,20132");
        student.displayInfo();
    }
}
