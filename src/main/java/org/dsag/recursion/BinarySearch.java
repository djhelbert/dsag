package org.dsag.recursion;

public class BinarySearch {

    public static int search(int[] data, int value, int left, int right) {
        if(data.length <= 0) {
            return -1;
        }

        int mid = (right + left) / 2;

        if(data[mid] == value) {
            return mid;
        } else {
            if(data[mid] > value) {
                return search(data, value, left, mid - 1);
            } else {
                return search(data, value, mid + 1, right);
            }
        }
    }

    public static void main(String[] args) {
        final int[] data = new int[] {1,2,3,4,6,7,8,9}; // Must be sorted
        System.out.println(BinarySearch.search(data, 4, 0, 7));
        System.out.println(BinarySearch.search(data, 3, 0, 7));
        System.out.println(BinarySearch.search(data, 9, 0, 7));
    }
}
