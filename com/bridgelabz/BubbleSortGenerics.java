package com.bridgelabz;

import java.util.Arrays;

public class BubbleSortGenerics<M> {
    //main method
    public static void main(String[] args) {
        Integer[] array = {4, 1, 3, 7, 8, 6};
        BubbleSortGenerics bubbleSort = new BubbleSortGenerics();
        bubbleSort.sorting(array);
    }

    //bubble sort method
    public <M> void sorting(Integer array[]) {
        for (Integer i = 0; i < array.length; i++) {
            for (Integer j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array :" + Arrays.toString(array));
    }
}
