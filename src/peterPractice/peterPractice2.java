package peterPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class peterPractice2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
}




















































