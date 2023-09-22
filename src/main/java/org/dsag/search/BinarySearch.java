package org.dsag.search;

/**
 * Binary Search Algorithm
 */
public class BinarySearch {
    public static int search(int arr[], int value) {
        int start = 0;
        int end = arr.length-1;
        int middle = (start + end) / 2;

        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle -1;
            } else {
                start = middle + 1;
            }
            middle = (start+end)/2;
        }

        if (arr[middle] == value) {
            return middle;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        final int[] data = new int[] {1,2,3,4,6,7,8,9}; // Must be sorted
        System.out.println(BinarySearch.search(data, 4));
        System.out.println(BinarySearch.search(data, 3));
        System.out.println(BinarySearch.search(data, 9));
        System.out.println(BinarySearch.search(data, 0));
    }
}
