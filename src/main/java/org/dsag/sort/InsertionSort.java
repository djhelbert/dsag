package org.dsag.sort;

import java.util.Arrays;

/**
 * Insertion Sort Algorithm
 */
public class InsertionSort {
    public static void sort(int[] data) {
        for(int i=1; i<data.length; i++) {
            int j = i;
            int current = data[i];

            while(j > 0 && data[j-1] > current) {
                data[j] = data[j-1];
                j--;
            }

            data[j] = current;
        }
    }

    public static void main(String[] args ) {
        int[] data = new int[] {1, 3, 7, 8, 3, 5, 8, 9, 2, 0, 6};
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
