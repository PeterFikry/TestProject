package class19;

public class Teacher {

    String name;
    int teacherId;
    String subject;

    Teacher(String name,int teacherId){
        this.name=name;
        this.teacherId=teacherId;
    }

    Teacher(String name,int  teacherId,String subject){
        this(name,teacherId);       //we can call to first constructor
        this.subject=subject;
    }
}
