package org.dsag.sort;

/**
 * Quick Sort Algorithm O(NLogN)
 */
public class QuickSort {

    private int partition(int[] numbers, int low, int high) {
        int pivotValue = numbers[high];
        int left = low - 1;

        for (int j=low; j<high; j++) {
            if (numbers[j] <= pivotValue) {
                swap(numbers, ++left, j);
            }
        }

        swap(numbers, high, left + 1);
        return left + 1;
    }

    public void sort(int[] numbers, int l, int h) {
        if(numbers == null) {
            return;
        } else if(numbers.length == 1) {
            return;
        } else if (l < h) {
            int index = partition(numbers, l, h);

            sort(numbers, l, index-1);
            sort(numbers, index+1, h);
        }
    }

    /**
     * Swap Numbers
     * @param numbers Number Data
     * @param i1 Index 1
     * @param i2 Index 2
     */
    private void swap(int[] numbers, int i1, int i2) {
        int temp = numbers[i2];
        numbers[i2] = numbers[i1];
        numbers[i1] = temp;
    }

    public static void main(String args[]) {
        int[] data = {10, 7, 8, 4, 9, 1, 5, 6, 3, 2, 12, 11};
        int n = data.length;

        QuickSort qs = new QuickSort();
        qs.sort(data, 0, n-1);

        for(int i = 0; i < n; ++i) {
            System.out.print(data[i] + " ");
        }
    }
}
