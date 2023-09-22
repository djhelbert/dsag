package org.dsag.sort;

import java.util.Arrays;

/**
 * Insertion Sort Algorithm
 */
public class InsertionSort {
    public static void sort(int[] data) {
        int size = data.length;

        for(int i=1; i<size; i++) {
            int j = i;
            int temp = data[i];

            while(j > 0 && data[j-1] > temp) {
                data[j] = data[j-1];
                j--;
            }

            data[j] = temp;
        }
    }

    public static void main(String[] args ) {
        int[] data = new int[] {1, 3, 7, 8, 3, 5, 8, 9, 2};
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
