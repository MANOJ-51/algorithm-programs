package com.bridgelabz;

public class PrimeNumbersInRange {
    //method to find prime number from 0-1000
    public static void primeNumbersInRange() {
        for (int index = 0; index <= 1000; index++) {
            int count = 1;
            for (int number = 2; number <= index; number++) {    //starts from 2
                if ((index % number) == 0) {
                    count++;
                } else {
                    continue;
                }
            }
            if (count == 2 && index != 1) {
                System.out.println(index + " ");       //printing prime numbers
            }
        }
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Prime numbers Range 0 to 1000");
        PrimeNumbersInRange.primeNumbersInRange();
    }
}
