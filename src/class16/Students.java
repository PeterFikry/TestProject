package class16;

public class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students stu1=new Students();
        stu1.name="Jason";
        stu1.ID="1";
        stu1.numberOfStudents++;

        Students stu2=new Students();
        stu2.name="Jianna";
        stu2.ID="2";
        stu2.numberOfStudents++;

        Students stu3=new Students();
        stu3.name="Justin";
        stu3.ID="3";
        stu3.numberOfStudents++;

        System.out.println(numberOfStudents);
    }
}
