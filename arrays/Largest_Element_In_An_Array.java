import java.util.*;
public class Largest_Element_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
    }
}