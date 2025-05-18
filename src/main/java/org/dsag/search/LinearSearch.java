package org.dsag.search;

public class LinearSearch {
    public static int search(int[] data, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (data[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 4, 10, 40};
        int x = 10;

        int result = search(data, data.length, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}