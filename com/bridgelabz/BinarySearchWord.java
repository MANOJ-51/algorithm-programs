package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
    //search method
    static int binarySearch(String[] array, String userChoice) {
        int firstIndex = 0, lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;      //finding mid element

            int result = userChoice.compareTo(array[mid]);       //comparing result

            if (result == 0) {            // Check if userchoice is present at mid
                return mid;
            } else if (result > 0) {              // If it is greater, increasing index
                firstIndex = mid + 1;
            } else {                        // If it is smaller, decreasing index
                lastIndex = mid - 1;
            }
        }

        return -1;
    }

    // main method
    public static void main(String[] args) {
        String[] array = {"manoj", "navdeep", "ajay", "sai", "bro"};
        Arrays.sort(array);                                                     //sorting given array
        System.out.println("sorted array :" + Arrays.toString(array));          //printing sorted array
        System.out.println("Enter the string to find the index");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        int result = binarySearch(array, userChoice);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
