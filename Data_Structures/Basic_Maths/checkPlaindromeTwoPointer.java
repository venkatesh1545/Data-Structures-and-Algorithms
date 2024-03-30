/*
Problem Statement: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
Example of Palindrome:
Input: str = “abba” 
Output: Yes



Approach: 
Our approach will be that we will first convert the string to lowercase.
Then, we will take two pointers i pointing to the start of the string and j pointing to the end of the string.
Keep incrementing i and decrementing j 
while i < j and at every step check whether the characters at these pointers are the same or not.
If not then the string is not a palindrome else it is palindrome.
 */
package Data_Structures.Basic_Maths;

public class checkPlaindromeTwoPointer {
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "abba";
        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
//Time complexity: O(n), space complexity: O(1)
