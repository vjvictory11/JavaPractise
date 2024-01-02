package dsa.sorting;

import static dsa.sorting.utility.printArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 67, -1, 2, 45, 7, 0};
        int n = arr.length;

        quickSort(arr,0,n-1);
        printArray(arr);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = low;

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i , high);
        return i;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
