package HomeWorkFeb042023;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        teacher.name="Justin";
        teacher.id=234;
        teacher.subject="Java";
        teacher.breakTime();
        System.out.println(teacher.name);
        System.out.println(teacher.id);


        MathTeacher mt=new MathTeacher();
        mt.name="Fikry";
        mt.id=974;
        mt.subject="Algebra";
        mt.duration();
        System.out.println(mt.name);
        System.out.println(mt.subject);

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.name="Paula";
        ct.id=239;
        ct.subject="chemistry";
        ct.location();
        ct.classTime();
        System.out.println(ct.name);
        System.out.println(ct.id);

        PianoTeacher pt=new PianoTeacher();
        pt.name="Dalal";
        pt.id=060;
        pt.subject="Music";
        pt.instrumentName="Piano";
        pt.classTime();
        pt.breakTime();
        System.out.println(pt.instrumentName);
        System.out.println(pt.id);
    }
}
