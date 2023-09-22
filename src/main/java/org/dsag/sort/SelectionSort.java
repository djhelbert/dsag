package org.dsag.sort;

import java.util.Arrays;

/**
 * Selection Sort Algorithm
 */
public class SelectionSort {

    public static void sort(int[] data) {
        int size = data.length;

        for(int i=0; i<size; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;

            for(int j = i; j < size; j++) {
                if(data[j] < min) {
                    min = data[j];
                    idx = j;
                }
            }

            data[idx] = data[i];
            data[i]   = min;
        }
    }

    public static void main(String[] args ) {
        int[] data = new int[] {1, 3, 7, 8, 3, 5, 8, 9, 2};
        SelectionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
