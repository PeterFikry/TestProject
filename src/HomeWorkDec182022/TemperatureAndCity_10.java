package HomeWorkDec182022;

import java.util.Scanner;

public class TemperatureAndCity_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In which city do you live?");
        String cityName=input.nextLine();
        System.out.println("What is the temperature in your city in Fahrenheit?");
        int temperature=input.nextInt();
        int celsius=(temperature-32)*5/9;
        System.out.println("The temperature is "+celsius+" ,The City is "+cityName);

    }
}
