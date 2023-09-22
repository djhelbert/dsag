package org.dsag.heap;

/**
 * Binary Heap (min)
 */
public class BinaryHeap {
    int[] heap;
    int size = 0;
    int capacity = 0;

    public BinaryHeap(int heapSize) {
        heap = new int[heapSize];
        capacity = heapSize;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public boolean insert(int value) {
        if (getSize() == capacity) {
            return false;
        }

        int i = size;
        heap[size] = value;
        size++;

        while (i != 0 && heap[i] < heap[parent(i)]) {
            swap(heap, i, parent(i));
            i = parent(i);
        }

        return true;
    }

    public int peek() {
        return heap[0];
    }

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(33);
        heap.insert(12);
        System.out.println(heap.peek());
        heap.insert(10);
        System.out.println(heap.peek());
        heap.insert(8);
        System.out.println(heap.peek());
        heap.insert(23);
        System.out.println(heap.peek());
        heap.insert(4);
        System.out.println(heap.peek());
        heap.insert(13);
        System.out.println(heap.peek());
        heap.insert(2);
        System.out.println(heap.peek());
        heap.insert(1);
        System.out.println(heap.peek());
    }
}
