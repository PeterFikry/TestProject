package HomeWorkJan302023;

public class Task_3 {
    /*
    3)Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package and observe result.
     */

    String name;
    int age;
    String gender;
    double weight;

    public Task_3 (String clientName,int clientAge,String clientGender,double clientWeight){
        name=clientName;
        age=clientAge;
        gender=clientGender;
        weight=clientWeight;
    }


}
