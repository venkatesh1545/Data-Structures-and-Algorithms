/*
 Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.
Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 */

package Data_Structures.Basic_Maths;
import java.util.*;
@SuppressWarnings("unused")
public class Divisors {
    public static void main(String[] args){
		
		printDivisorsOptimal(36);
		
	}

	public static void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
			
		System.out.println();
	}
}
//time complexity:O(sqrt(n)), space complexity:O(1)