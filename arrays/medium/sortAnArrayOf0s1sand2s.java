import java.util.*;

//
///**
// * Brute Force technique
// */
//public class sortAnArrayOf0s1sAnd2s{
//    public static void sortTheArray(int[] arr) {
//        int l = arr.length;
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//        for(int i = 0; i < l; i++) {
//            if(arr[i] == 0) {
//                zeros++;
//            }
//            else if(arr[i] == 1) {
//                ones++;
//            }
//            else {
//                twos++;
//            }
//        }
//
//        for(int i = 0; i < zeros; i++) {
//            arr[i] = 0;
//        }
//
//        for(int i = zeros -1; i < zeros + ones; i++)
//        {
//            arr[i] = 1;
//        }
//
//        for(int i = zeros + ones - 1; i < l; i++) {
//            arr[i] = 2;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,0,2,1,1,0};
//        sortTheArray(arr);
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println("The Sorted Array is: " + arr[i]);
//        }
//    }
//}

/**
 * Optimal Solution Duch National Flag
 */

public class sortAnArrayOf0s1sAnd2s {
    public static void sortTheArray(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;
                mid++;
            }
        }
    }
    public static void main(String args[]) {
        int[] arr = {2,0,2,1,1,0};
        sortTheArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("The Sorted Array is: " + arr[i]);
        }
    }
}
