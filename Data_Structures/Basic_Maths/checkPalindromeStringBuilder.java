/*
Problem Statement: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
Example of Palindrome:
Input: str = “abba” 
Output: Yes

Approach:
First, we take the String input from the user.
Then we create the Stringbuilder object “str1″and store the value of String in it.
The reverse() method in Stringbuider give us the reverse String. Ee store that reverse String in “str1”.
With the help of equals() method we compare the value’s of the string, with the help of if and else condition check the string value are similar or not.
 */

package Data_Structures.Basic_Maths;
public class checkPalindromeStringBuilder {
    public static void main(String[] args) {
        String str = "palindrome"; 
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        
        if (str.equals(str1.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}
//Time Complexity:O(n), space complexity: O(n).

