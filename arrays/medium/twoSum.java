package medium;
import java.util.*;

/**
 * <h1>Variation 1</h1>
 * where we have to just find is there a pair of element in the array
 * whose sum is equal to the given target or not.
 */
public class twoSum {

    public  static boolean findTwoSum(int[] arr, int target) {
        int l = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < l; i++) {
            int remaining = target - arr[i];
            if(mpp.containsKey(remaining)) {
                return true;
            }
            mpp.put(arr[i], 0);
        }
        return false;
    }
    public static void main(String args[]) {
        int[] arr = {2, 9, 11, 15};
        int target = 9;
        boolean ans = findTwoSum(arr,target);
        System.out.println(ans);
    }
}

/**
 * <h1>Variation 2</h1>
 */


