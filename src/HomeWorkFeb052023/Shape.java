package HomeWorkFeb052023;

public class Shape {
    /*
    1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;

    Shape (double radius){
        this.radius=radius;

    }
}
class circle extends Shape{

    double area=Math.PI * (radius * radius);
    circle(double radius){
        super(radius);
    }
void circleArea(){
    System.out.println("The area or circle is : "+area);
}

    public static void main(String[] args) {
        circle circle=new circle(3.5);
        circle.circleArea();
    }
}
