package dsa.sorting;

import static dsa.sorting.utility.printArray;
import static dsa.sorting.utility.swap;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 67, -1, 2, 45, 7, 0};
        int n = arr.length;

        // heapify
        //swap the root and the last element
        //do heapify again for remaining tree

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n-1);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i-1);
        }
        printArray(arr);
    }

    public static void heapify(int[] arr, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }

}
