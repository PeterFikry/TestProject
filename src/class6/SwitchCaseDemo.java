package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country = "Afghanistan";


        //System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) {               //  converts the text to lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "Afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");



        }
    }
}