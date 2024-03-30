/*
 * Problem Statement: Given an array of size N. Find the highest and lowest frequency element
 * Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:

Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */

 /*
Brute force:
The steps are as follows:

1)Make a visited array of type boolean.
2)Use the first loop to point to an element of the array.
3)Initialize the variable count to 1.
4)Make that index true in the visited array.
5)Run the second loop, if we find the element then mark the visited index true and increase the count.
6)If the visited index is already true then skip the other steps.
7)After step 5, we will keep a track of the element with the highest frequency and the lowest frequency.
*/
package Data_Structures.Basic_Hashing;

public class HighestLoewstFrequencyElementBrute {
    public static void main(String args[]) {

        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}
//Time complexity: O(n*n),Space complexity: O(n) 