package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arrayToSort = {3,9,4,7,5};
        BubbleSort sort = new BubbleSort();
        int[] sortedArray = sort.sortArray(arrayToSort);
        System.out.println(Arrays.toString(sortedArray));
    }
}
