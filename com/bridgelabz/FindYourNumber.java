package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class FindYourNumber {
    //creating array list to store values
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    //creating scanner class to take input from the user
    static Scanner scanner = new Scanner(System.in);

    //adding elements into array list
    public static void addNumbers(int N) {
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
    }

    //method to find number
    public static int findNumber(ArrayList<Integer> arrayList, int firstNumber, int lastNumber) {

        int middleNumber = (firstNumber + lastNumber) / 2;          //finding middle number

        System.out.println("Enter -1 if your number is less than " + middleNumber);
        System.out.println("Enter 0 if your number is equal " + middleNumber);
        System.out.println("Enter 1 if your number is greater than " + middleNumber);

        int userChoice = scanner.nextInt();

        if (userChoice == 0) {
            return middleNumber;
        } else if (userChoice == -1) {
            lastNumber = middleNumber - 1;
            return findNumber(arrayList, firstNumber, lastNumber);           //find value in the left side of array list
        } else if (userChoice == 1) {
            firstNumber = middleNumber + 1;
            return findNumber(arrayList, firstNumber, lastNumber);           //find value in the right value of array list
        } else {
            System.out.println("choose a valid option");
        }
        return -1;                //returns -1 if user number not in range
    }

    //printing method
    public static void print(int result) {
        if (result == -1) {
            System.out.println("please choose a valid option");
        } else {
            System.out.println("Found your Number : " + result);
        }
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to Find your Number Program");

        System.out.println("Enter the Maximum Number to select the Range of 0 - N ");
        int maximumNumber = scanner.nextInt();

        FindYourNumber.addNumbers(maximumNumber);

        System.out.println("Choose any number form 0 to " + maximumNumber);

        System.out.println("Enter 1 to find your Number");
        int start = scanner.nextInt();

        if (start == 1) {
            int firstNumber = 0;
            int lastNumber = arrayList.size();

            int result = findNumber(arrayList, firstNumber, lastNumber);

            FindYourNumber.print(result);
        } else {
            System.out.println("Enter only 1 to start");
        }
    }
}
