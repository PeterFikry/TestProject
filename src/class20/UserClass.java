package class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobileNum;

    UserClass(String name,int mobileNum){
        this.name=name;
        this.mobileNum=mobileNum;
    }
}
class userInfo extends UserClass{

    String address;

    userInfo(String name,int mobileNum,String address){
        super(name, mobileNum);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" his phone number is "+mobileNum+" and his address in "+address);
    }
}