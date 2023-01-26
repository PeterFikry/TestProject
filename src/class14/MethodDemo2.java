package class14;

import java.util.Scanner;

public class MethodDemo2 {

    // defining a method        void means no output
    void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // below way is more easy and most common
    void printHelloManyTimes(int times) {

        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java World");
        }
    }

    void printManyTimes(int time, String word) {

        for (int i = 0; i < time; i++) {
            System.out.println(word);

        }

    }

}

