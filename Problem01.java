package com.mycompany.week8_skeletoncode_lab;

public class Problem01 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to return the sum of prime numbers between 1 and n
    public static long getSumOfPrimes(int n) {
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    // Test the function
    public static void main(String[] args) {
        int n = 20;
        long sum = getSumOfPrimes(n);
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);
    }
}
