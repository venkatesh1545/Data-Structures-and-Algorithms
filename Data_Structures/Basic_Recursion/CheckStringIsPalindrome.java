/*
 *Problem statement: Given a string, write a recursive function that checks if the given string is a palindrome, else, not a palindrome.

Examples: 

Input : malayalam
Output : Yes
Reverse of malayalam is also
malayalam.

Input : max
Output : No
Reverse of max is not max.
 */
package Data_Structures.Basic_Recursion;

public class CheckStringIsPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "max"; //for str = malayalam it will be true
        boolean isPal = isPalindrome(str);
        if (isPal) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
