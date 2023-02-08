package HomeWorkJan282023;

public class Hello_4 {
    //4)Create a method that will say Hello in different language
    // based on the country that will be passed when method is executed

    String sayHello(String country) {
        switch (country) {
            case "Egypt":
                return "Ahlan";
            case "USA":
                return "Hello";
            case "Spain":
                return "ola";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Hello_4 hello4 = new Hello_4();
        System.out.println(hello4.sayHello("Egypt"));
    }

}
