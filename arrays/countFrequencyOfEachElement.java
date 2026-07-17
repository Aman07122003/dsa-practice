import java.util.*;
public class countFrequencyOfEachElement {
    public static void printCountFrequency(int[] arr) {
        int l = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i<l; i++){
          int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            System.out.println("The number " + it.getKey() + " has frequency " + it.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 2, 1, 5, 4};
        printCountFrequency(arr);
    }
}
