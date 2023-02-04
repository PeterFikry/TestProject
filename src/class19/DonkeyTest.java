package class19;

import class17.Dog;

public class DonkeyTest {
    public static void main(String[] args) {

        //Donkey donkey= new Donkey();   //default constructor creates by the compiler when a programmer does not create one.

        Donkey donkey=new Donkey("Pepper",3); //the moment you create a constructor compiler dies not give any DEFAULT constructor
        donkey.print();
        // Donkey's name is null age is 0 and weight is 0.0
    }
}
