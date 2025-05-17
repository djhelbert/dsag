package org.dsag.hack;

/**
 * Window Sliding Technique is a computational technique that aims to reduce the
 * use of nested loops and replace it with a single loop, thereby reducing the time complexity.
 */
public class SlidingWindow {
    static int maxSum(int data[], int k) {
        int n = data.length; // Length of array

        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += data[i];
        }

        // Compute sums of remaining windows by removing first element of previous
        // window and adding last element of current window.
        int windowSum = maxSum;

        for (int i = k; i < n; i++) {
            windowSum += data[i] - data[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;

        System.out.println(maxSum(array, k)); // 24
    }
}
