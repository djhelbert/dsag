package org.dsag.recursion;

public class BinarySearch {

    public static int search(int[] data, int val, int left, int right) {
        int middle = (left + right) / 2;

        if (left == right) {
            return -1;
        } else if (data[middle] == val) {
            return middle;
        } else {
            if (val > data[middle]) {
                return search(data, middle + 1, right, val);
            } else {
                return search(data, left, middle - 1, val);
            }
        }
    }

    public static void main(String[] args) {
        final int[] data = new int[]{1, 2, 3, 4, 6, 7, 8, 9}; // Must be sorted
        System.out.println(BinarySearch.search(data, 4, 0, data.length-1));
    }
}
