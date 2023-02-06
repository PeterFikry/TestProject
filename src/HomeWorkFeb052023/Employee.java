package HomeWorkFeb052023;

public class Employee {
    /*
    2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
     */
    String name;
    int ID;
    String title;
    Employee (String name,int ID,String title){
        this.name=name;
        this.ID=ID;
        this.title=title;
    }
   void location(){
       System.out.println("Company Location is Washington DC");
    }
    void companyType(){
        System.out.println("The company type is partnership");
    }
    void employeeInfo(){
        System.out.println("Employee name is :"+name+" ID number "+ID+" Employee title is "+title);
        }
}
 class FullTime extends Employee{
    int numberOfHours;
    int hourlyRate;
    FullTime(String name,int ID,String title,int numberOfHours,int hourlyRate){
        super(name, ID, title);
        this.numberOfHours=numberOfHours;
        this.hourlyRate=hourlyRate;
    }
    void medicalInsurance(){
        System.out.println("All full time employees has a medical insurance");
    }
    void retirementPlan(){
        System.out.println("All full time employees has a retirement plan");
    }
    void fullInfo(){
        System.out.println("Employee name is :"+name+" ID number "+ID+" Employee title is "+title+" working hours per day "+numberOfHours+" Pay rate per hour is "+hourlyRate);
    }
}
class PartTime extends Employee{
    int vacationDays;
    PartTime(String name,int ID,String title,int vacationDays){
        super(name, ID, title);
        this.vacationDays=vacationDays;
    }
    void daysOff(){
        System.out.println("Part time employees has 3 days off per week");
    }
    void partInfo(){
        System.out.println("Employee name is :"+name+" ID number "+ID+" Employee title is "+title+" number of Vacation days "+vacationDays);
    }
}
class tester extends FullTime{
    tester(String name, int ID, String title, int numberOfHours, int hourlyRate) {
        super(name, ID, title, numberOfHours, hourlyRate);
    }
    void daysOff(){
        System.out.println("Part time employees has 2 days off per week");
    }
    void testerInfo(){
        System.out.println("Employee name is :"+name+" ID number "+ID+" Employee title is "+title+" working hours per day "+numberOfHours+" Pay rate per hour is "+hourlyRate);
    }
    public static void main(String[] args) {
        FullTime fullTime=new FullTime("peter",235,"General Manager",8,60);
        fullTime.fullInfo();
        fullTime.medicalInsurance();
        fullTime.retirementPlan();

        tester tester=new tester("Justin",345,"Supervisor",8,40);
        tester.daysOff();
        tester.testerInfo();
    }
}