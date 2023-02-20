package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer=new Integer(10);
        int number=integer;     //its auto unBoxing
        int number2=integer.intValue(); //unBoxing

        double d=12.3;
        Double wrapperD=new Double(d);  //boxing
        Double wrapperP=d;  //autoBoxing

        Float f=12.4f;
        ArrayList<Double> arrayList=new ArrayList<>();
        arrayList.add(12.0);

        double fg=12;
    }
}
