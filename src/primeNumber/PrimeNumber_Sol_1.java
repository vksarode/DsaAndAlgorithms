package primeNumber;

import java.util.Scanner;

public class PrimeNumber_Sol_1 {
    public static void main(String[] args) {
        int N = 0;
        System.out.println("Enter a number to check if it is a prime number or not");
        Scanner scanner = new Scanner(System.in);
        while ((N = scanner.nextInt()) != 0) {
            boolean primeOrNot = isPrime(N);
            System.out.println("The number:" + N + "is" + (primeOrNot? " prime number": " not a prime number"));
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
