package org.dsag.sort;

import java.util.Random;

public class QSort {

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, high);

        int leftPointer = partition(array, low, high, pivotValue);

        quicksort(array, low, leftPointer - 1);
        quicksort(array, leftPointer + 1, high);

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int left = lowIndex;
        int right = highIndex - 1;

        while (left < right) {
            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (array[left] <= pivot && left < right) {
                left++;
            }
            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (array[right] >= pivot && left < right) {
                right--;
            }

            swap(array, left, right);
        }

        if(array[left] > array[highIndex]) {
            swap(array, left, highIndex);
        }
        else {
            left = highIndex;
        }

        return left;
    }

    private static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 4, 9, 1, 5, 6, 3, 2, 12, 11};
        int n = data.length;

        quicksort(data);

        for(int i = 0; i < n; ++i) {
            System.out.print(data[i] + " ");
        }
    }
}
