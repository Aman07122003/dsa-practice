import java.util.*;
public class getSingleElement {

    public static int getElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i =0; i<n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if(it.getValue() == 1) {
                return it.getKey();
            }
         }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 5, 1, 3, 2};
        int ans = getElement(arr);
        System.out.println("The single element in the array is: " + ans);
    }

}
