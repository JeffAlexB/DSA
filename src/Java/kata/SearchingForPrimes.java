package Java.kata;

import java.util.ArrayList;
import java.util.List;

public class SearchingForPrimes {
    /**
     By listing the first six prime numbers: 2, 3, 5, 7, 11 and 13, we can see that the 6th prime is 13.
     What is the 10 001st prime number? -> should be '104743'
     */
    public static int PrimeNumberAtPosition(int lastPrimeIndex) {
        lastPrimeIndex -= 1;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int arrayLength = 0;

        while (arrayLength < lastPrimeIndex) {
            if (isPrime(count)) {
                list.add(count);
                arrayLength += 1;
            }
            count += 1;
        }

        return list.getLast();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return false;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}