package dsa.sorting;

import static dsa.sorting.utility.printArray;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 67, -1, 2, 45, 7, 0};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] <= arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        printArray(arr);
    }
}
