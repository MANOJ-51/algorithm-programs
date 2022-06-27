package com.bridgelabz;

import java.util.Arrays;

public class BubbleSort {
    //main method
    public static void main(String[] args) {
        int[] array = {4, 1, 3, 7, 8, 6};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorting(array);
    }

    //bubble sort method
    public void sorting(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array :" + Arrays.toString(array));
    }
}
