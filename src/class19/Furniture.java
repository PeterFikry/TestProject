package class19;

public class Furniture {

    String type;
    double price;
    String color;

    // with the help of constructor we can initialize object with specific vlaue
    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;

    }

    //void Furniture(){}        this is a method with name Furniture . why - because of return type.


    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
