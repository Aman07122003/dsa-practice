//import java.util.*;
//
//public class countSubarraySumEqualsK {
//
//    public static int subarraySum(int[] arr, int target) {
//        int l = arr.length;
//        int count = 0;
//
//        for(int i = 0; i < l; i++) {
//            int sum = 0;
//
//            for(int j = i; j < l; j++ ) {
//                sum += arr[j];
//
//                if(sum == target) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 4};
//        int target = 6;
//        int count = subarraySum(arr, target);
//        System.out.println("The number subarrays having sum 6 = " + count);
//    }
//}

import java.util.*;

public class countSubarraySumEqualsK {
    public static int countSubarray(int[] arr, int target) {
        int l = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        mpp.put(0, 1);
        for(int num: arr) {
            prefixSum += num;
            if(mpp.containsKey(prefixSum - target)) {
                count += mpp.get(prefixSum - target);
            } else {
                mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
            }
        }

        return count;

    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        int target = 6;
        int count = countSubarray(arr, target);
        System.out.println("The subarray count = " + count);
    }
}