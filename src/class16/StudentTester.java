package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Peter";
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weight=70;

        Student student1=new Student();
        student1.name="Justin";
        student1.id="456";
        //student1.schoolName="Syntax";
        student1.age=33;
        student1.weight=86;

        Student student2=new Student();
        student2.name="Jason";
        student2.id="789";
        //student2.schoolName="Syntax";
        student2.age=25;
        student2.weight=46;

        System.out.println(student2.schoolName);
        System.out.println(student.schoolName); //another way that you might see a lot to access static variables
        System.out.println(student2.name);

    }
}
