package class17;

public class Student {

        /*
        Create a class call it Student define 4 instance fields like
        ID ,Name , age , weight create 5 objects of this class do this without
        constructors and with constructors.
         */

    String ID;
    String name;
    int age;
    double weight;

    Student(String studentID,String studentName,int studentAge,double studentWeight){
        ID=studentID;
        name=studentName;
        age=studentAge;
        weight=studentWeight;}

    void printStudentInfo(){
        System.out.println("ID "+ID+" Name "+name+" age "+age+" Weight "+weight);
    }


}
