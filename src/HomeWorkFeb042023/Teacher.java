package HomeWorkFeb042023;

public class Teacher {
    String name;
    int id;
    String subject;

    void classTime() {
        System.out.println("Class during the daytime");
    }

    void location() {
        System.out.println("Class location is in the school building");
    }

    void duration() {
        System.out.println("Class duration is 45 minutes");
    }

    void breakTime() {
        System.out.println("Lunch break at 12 pm");
    }
}

class MathTeacher extends Teacher {

    int yearsOfExperience;

    void classTime() {
        System.out.println("Class during the daytime");
    }
}

class ChemistryTeacher extends Teacher {

    int numberOfWorkDays;

    void duration() {
        System.out.println("Class duration is 45 minutes");
    }
}

class PianoTeacher extends Teacher {

    String instrumentName;

    void classTime() {
        System.out.println("Class during the daytime");
    }
}



