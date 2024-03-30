/*
Problem Statement: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
Example of Palindrome:
Input: str = “abba” 
Output: Yes

Approach:
By Reversing the given string and comparing.
We can check if the given string is a palindrome by comparing the original string with its reversed version. 
 */

package Data_Structures.Basic_Maths;

public class CheckPalindromeNaiveSolution {
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "abba";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}//Time complexity:O(n), space complexity: O(n).
