/*
Problem Statement: Count Elements in an Array

Given an array of integers, write a function to count the occurrences of each element in the array and print the counts.

Input: [1, 2, 3, 2, 1, 3, 4, 5, 4]
Output:
Element 1 occurs 2 times.
Element 2 occurs 2 times.
Element 3 occurs 2 times.
Element 4 occurs 2 times.
Element 5 occurs 1 times.

*/
package Data_Structures.Basic_Hashing;

import java.util.HashMap;

public class CountArrayElements {
    public static void countElements(int[] arr) {
        HashMap<Integer, Integer> cmp = new HashMap<>();
        for (int num : arr) {
            if (cmp.containsKey(num)) {
                // If the element is already in the HashMap, increment its count
                cmp.put(num, cmp.get(num) + 1);
            } else {
                // If the element is not in the HashMap, add it with count 1
                cmp.put(num, 1);
            }
        }

        // Print the counts of elements
        for (int key : cmp.keySet()) {
            System.out.println("Element " + key + " occurs " + cmp.get(key) + " times.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};
        countElements(arr);
    }
}
