package com.company;


public class BubbleSort {
    public int[] sortArray(int[] arrayToSort) {
    boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int x = arrayToSort[i];
                    int y = arrayToSort[i + 1];
                    arrayToSort[i] = y;
                    arrayToSort[i + 1] = x;
                    swapped = true;
                }
            }
        } while (swapped);
           return arrayToSort;
    }
}