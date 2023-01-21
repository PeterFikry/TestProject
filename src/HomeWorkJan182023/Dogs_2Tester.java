package HomeWorkJan182023;

public class Dogs_2Tester {
    public static void main(String[] args) {

        Dogs_2 Husky=new Dogs_2();
        Husky.breed="Siberian Husky";
        Husky.color="Mixed White & Black";
        Husky.age=5;
        Husky.gender="Male";
        Husky.eating();

        Dogs_2 Bulldog=new Dogs_2();
        Bulldog.breed="English Bulldog";
        Bulldog.color="Mixed Brown & White";
        Bulldog.age=3;
        Bulldog.gender="Female";
        Bulldog.bark();

        Dogs_2 Labrador=new Dogs_2();
        Labrador.breed="Labrador Retriever";
        Labrador.color="Beige";
        Labrador.age=6;
        Labrador.gender="Male";
        Labrador.sleep();

        System.out.println(Husky.breed);
        System.out.println(Bulldog.age);
        System.out.println(Labrador.gender
        );


    }
}
