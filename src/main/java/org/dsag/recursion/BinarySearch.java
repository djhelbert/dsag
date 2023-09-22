package org.dsag.recursion;

public class BinarySearch {

    public static int search(int[] data, int val, int left, int right) {
        if (right >= left && left <= data.length - 1) {
            int mid = left + (right - left) / 2;

            if (data[mid] == val) {
                return mid;
            }

            if (data[mid] > val) {
                return search(data, left, mid - 1, val);
            }

            return search(data, mid + 1, right, val);
        }

        return -1;
    }

    public static void main(String[] args) {
        final int[] data = new int[]{1, 2, 3, 4, 6, 7, 8, 9}; // Must be sorted
        System.out.println(BinarySearch.search(data, 4, 0, data.length-1));
    }
}
