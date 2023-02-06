package class20;

public class Child1 extends Parent {
    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Child1.bye();       //accessible by class name because it's a static method from the parent class
        //c1.money();   has private access in class20.parent

        c1.name="Michael";
        Child1.lastName="Jackson";

    }
}
