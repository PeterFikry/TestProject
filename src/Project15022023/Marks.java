package Project15022023;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
    Test your code
     */


    abstract double getPercentage();
}

class A extends Marks {
    double subject1;
    double subject2;
    double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }

}

class MarksTester {
    public static void main(String[] args) {
        A studentA = new A(70, 85, 95);
        B studentB = new B(80, 76, 89, 92);

        System.out.println("Student A average percentage " + studentA.getPercentage());
        System.out.println("Student B average percentage " + studentB.getPercentage());
    }
}


