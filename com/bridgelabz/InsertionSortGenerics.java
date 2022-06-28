package com.bridgelabz;

public class InsertionSortGenerics<M extends Comparable<M>> {
    //insertion sorting method
    public static <M extends Comparable<M>> String[] sorting(String array[], Integer length) {
        String temp;
        for (Integer i = 0; i < length; i++) {
            for (Integer j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //main method
    public static void main(String[] args) {
        String[] array = {"manoj", "sai", "ram", "ramesh"};
        String sortedArray[] = sorting(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
}
