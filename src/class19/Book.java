package class19;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String name;
    int price;
    String content;

    Book(String name,int price){
        this.name=name;
        this.price=price;
    }
    Book(String name,int price,String content){
        this(name,price);
        this.content=content;}
    void info(){
        System.out.println("Name "+name+" Price "+price+" Content "+content);

    }

    public static void main(String[] args) {
        Book book1=new Book("dsfkh",20,"sdfkhsd");
        book1.info();
        Book book2=new Book("sefyg",40,"aduhq");
        book2.info();

    }

}
