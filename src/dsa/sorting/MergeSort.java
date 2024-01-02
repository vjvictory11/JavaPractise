package dsa.sorting;

import static dsa.sorting.utility.printArray;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 67, -1, 2, 45, 7, 0};
        int n = arr.length;

        sort(arr,0,n-1);

        printArray(arr);
    }

    public static void sort(int[] arr, int l, int r) {
        if(l<r) {
            int mid = (l+r-1)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n = (high-low+1);
        int[] temp = new int[n];

        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=high) {
            temp[k++] = arr[j++];
        }
        k = 0;
        for (int l = low; l <= high; l++) {
            arr[l] = temp[k++];
        }
    }
}
