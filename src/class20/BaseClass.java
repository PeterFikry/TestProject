package class20;

public class BaseClass {
    String name="John";

    void hello(){
        System.out.println("Hello method from Base");
    }
}

class Child extends BaseClass{

    String name1="Jane";

    void callMe(){
        System.out.println(this.name);  //Jane
        System.out.println(super.name); //John
    }
    void hello(){
        System.out.println("Hello methods from child class");
    }
    void callingParentMethod(){
        hello();
        super.hello();
    }
}