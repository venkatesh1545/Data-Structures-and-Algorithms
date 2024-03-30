/*
 * Problem statement: Reverse an array in java using recursion:
 * Input:[1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
package Data_Structures.Basic_Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr, int start, int end) {
        // Base case: if start is greater than or equal to end, array is already reversed
        if (start >= end) {
            return;
        }
        
        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
