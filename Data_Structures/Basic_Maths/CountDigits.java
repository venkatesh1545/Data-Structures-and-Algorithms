/*
 Problem Statement: Given an integer N, write a program to count the number of digits in N.
 Example 1:
 Input N = 12345
 Output: 5
 Explanation: N has 5 digits


 Solutions:
 Solution-1: Algorithm/ Intution:
Store the integer in a variable X and initialize a counter variable to count the number of digits.
We know that in programming languages when we divide X by Y it will result in an integer (given both the variables are integers). For example, 133/10 will result in 13 similarly 1/10 will result in 0.
Using a for loop and above observation keep on dividing X by 10 and increment the count in every iteration when X equals 0 terminate the loop and the count will have the number of digits in N.

Solution-2: Algorithm:
Convert the integer into a string.
Find the length of the string 

solution-3: Algorithm:
Use logarithm base 10 to count the number of digits. As

The number of digits in an integer = the upper bound of log10(n).
*/

package Data_Structures.Basic_Maths;
public class CountDigits {
    static int count_digits(int n)
    {
        int x = n;
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));

    }
}//Time Complexity: O(n), Space Complexity: O(1)

/*Solution-2: */
/*
package Data_Structures.Basic_Maths;
import java.util.*;
@SuppressWarnings("unused")
public class CountDigits{
    public static int count_digits(int n){
        String n1 = Integer.toString(n);
        return n1.length();
    }
    public static void main(String[] args)
    {
        int n = 12345;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    }
}// Time complexity:O(1), space complexity: O(1)
*/

/*Solution-3:*/
/*
package Data_Structures.Basic_Maths;
import java.util.*;
@SuppressWarnings("unused")
public class CountDigits{
    public static int count_digits(int n)
    {
        int digits = (int)Math.floor(Math.log10(n)+1);
        return digits;
    }
    public static void main(String[] args)
    {
        int n = 12345;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    }
}//Time complexity: O(1), space complexity: O(1)
*/
