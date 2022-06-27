package com.bridgelabz;

import java.util.Arrays;

public class MergeSort {
    //merge sorting
    public static void mergeSorting(String[] array) {
        if (array == null) {
            return;             //checking array is null or not
        }
        if (array.length > 1) {
            int midIndex = array.length / 2;        //finding mid index

            //left half of the array
            String[] leftArray = new String[midIndex];           //left half = 0 -midindex
            for (int i = 0; i < midIndex; i++) {
                leftArray[i] = array[i];
            }

            //right half of the array
            String[] rightArray = new String[array.length - midIndex];       //right half =midindex to (arraylength-mid)
            for (int j = midIndex; j < array.length; j++) {
                rightArray[j - midIndex] = array[j];
            }

            mergeSorting(leftArray);          //recursive left half
            mergeSorting(rightArray);         // recursive right half

            int leftIndex = 0;     //left index value
            int rightIndex = 0;    //right index value
            int temp = 0;         //temp variable

            //merging two arrays right and left
            while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
                    array[temp] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[rightIndex] = rightArray[rightIndex];             //      merge sorting
                    rightIndex++;                                 //   original order :- cat ,bat ,apple ,dog
                }                                                 //  /2     1(cat,bat)       2(apple,dog)
                temp++;                                           //  /2    1.1(cat)(bat)      2.1(apple) (dog)
            }                                                     //compare 1.1 (bat)(cat)    2.1(apple)(dog)
            //merge (apple,bat,cat,dog)
            while (leftIndex < leftArray.length) {
                array[temp] = leftArray[leftIndex];
                leftIndex++;
                temp++;
            }

            while (rightIndex < rightArray.length) {
                array[temp] = rightArray[rightIndex];
                rightIndex++;
                temp++;
            }
        }
    }

    //main method
    public static void main(String[] args) {
        System.out.println(" Welcome to Merge Sort ");

        String[] array = {"cat", "bat", "apple", "dog"};
        System.out.println("original string array:" + Arrays.toString(array));    //printing original string array

        MergeSort.mergeSorting(array);       //applying merge sort to array
        System.out.println("Merge sorted array :" + Arrays.toString(array));
    }
}
