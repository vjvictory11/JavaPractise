package dsa.sorting;

import static dsa.sorting.utility.printArray;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 67, -1, 2, 45, 7, 0};
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }

}
