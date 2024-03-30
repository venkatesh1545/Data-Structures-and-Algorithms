/*
Problem Statement: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
Example of Palindrome:
Input: str = “abba” 
Output: Yes

Approach:
The approach is very simple. Just like the two-pointer approach, we will check the first and the last value of the string but this time it will be through recursion.

We will take two pointers i pointing to the start of the string and j pointing to the end of the string. 
Keep incrementing i and decrementing j while i < j and at every step. 
Check whether the characters at these pointers are the same or not. We are doing this through recursion – (i+1, j-1
If all the characters are the same on the ith and jth index till i>=j condition satisfies, print true else false

 */

package Data_Structures.Basic_Maths;
public class CheckPalindromeRecursive {
    public static boolean isPalindrome(int i, int j, String s)
    {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return isPalindrome(i + 1, j - 1, s);
        //i is incrementing and j is decrementing.

    }

    public static boolean isPalindrome(String s)
    {
        return isPalindrome(0, s.length() - 1, s);
    }
    public static void main(String[] args) {
        String s = "abba";

        // Convert the string to lowercase
        s = s.toLowerCase();
        boolean str = isPalindrome(s);
        System.out.println(str);
    }
}
//Time complexity:O(n), space complexity: O(1)
