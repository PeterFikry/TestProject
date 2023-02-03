package HomeWorkJan302023;

public class students_2 {
    /*
    2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name. NOTE: please use different names for instance and local variables.
     */

    String name;
    int math,english,science;
    double average;

    students_2(String studentName,int mathGrade,int englishGrade,int scienceGrade){
        name=studentName;
        math=mathGrade;
        english=englishGrade;
        science=scienceGrade;
        average=(mathGrade+englishGrade+scienceGrade)/3;
    }

    void printAverage(){
        System.out.println("Student Name: "+name+" Math Grade: "+math+" English Grade: "+english+" Science Grade: "+science);
        System.out.println(name+"Average Grade is: "+average);
    }

}
