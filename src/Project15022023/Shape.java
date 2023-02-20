package Project15022023;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Test {
    public static void main(String[] args) {
        Shape Circle = new Circle(7.0);
        System.out.println("Circle Area " + Circle.calculateArea());
        System.out.println("Circle Perimeter " + Circle.calculatePerimeter());

        Shape Square = new Square(6);
        System.out.println("Square Area " + Square.calculateArea());
        System.out.println("Square Perimeter " + Square.calculatePerimeter());
    }
}
