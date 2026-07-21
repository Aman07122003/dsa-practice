//import java.util.*;
//
//public class findMajoorityElementNBy2times {
//
//    public static boolean findElement(int[] arr) {
//        int l = arr.length;
//
//        for(int i = 0; i < l; i++) {
//            int count = 0;
//            for(int j = 0; j < l; j++) {
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if(count > l/2) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 7, 7, 7, 7, 7, 1, 9};
//        System.out.println("Ans = " + findElement(arr));
//    }
//}

//
//import java.util.*;
//public class findMajorityElementNBy2times {
//    public static boolean findMajourity(int[] arr)  {
//        int l = arr.length;
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//        for(int i = 0; i < l; i++) {
//            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
//        }
//
//        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if(it.getValue() > l/2) {
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 7, 7, 7, 7, 7, 1, 9};
//        System.out.println("Ans = " + findMajourity(arr));
//    }
//}


import java.util.*;
public class findMajourityElementNBy2times {
    public static boolean findMajourity(int[] arr) {
        int l = arr.length;
        int prev = arr[0];
        int count = 1;
        for(int i = 1; i < l; i++) {
            if(arr[i] == prev) {
                count++;
            } else {
                count--;
                if(count < 0) {
                    prev = arr[i];
                    count = 1;
                }
            }
        }
        if(count > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)  {
        int[] arr = {3, 4, 7, 7, 7, 7, 7, 1, 9};
        System.out.println("Ans = " + findMajourity(arr));
    }
}