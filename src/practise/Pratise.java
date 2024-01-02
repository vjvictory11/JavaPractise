package practise;

import java.util.*;
import java.util.stream.Collectors;

public class Pratise {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findElement(arr, 0, 0, arr.length-1));
    }

    static int findElement(int[] arr, int x, int low, int high) {
        while(low<=high) {
            int mid = (low+high)/2;
            if (isRoatedIndex(mid, arr)) {
                if(arr[mid]==x) {
                    return mid;
                }
                else if(arr[mid]>x) {
                    high = mid-1;
                } else {
                    if(arr[low]>x) {
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                }
            } else {
                if(arr[mid]==x) {
                    return mid;
                } else if(arr[mid] > x) {
                    high = mid-1;
                } else {
                    if(arr[low] > x) {
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                }
            }
        }
        return -1;
    }

    static boolean isRoatedIndex(int index, int[] arr) {
        if(index==arr.length-1) {
            return false;
        } else if(arr[index]>arr[index+1]) {
            return true;
        }
        return false;
    }

}
