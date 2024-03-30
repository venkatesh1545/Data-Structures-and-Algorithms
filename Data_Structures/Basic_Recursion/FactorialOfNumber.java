/*
 Problem statement: Factorial of a N number
 Example:
 Input: 5
 output: 120
 Explanation: 5*4*3*2*1 = 120
 
 */
package Data_Structures.Basic_Recursion;

public class FactorialOfNumber {
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: factorial of n is n multiplied by factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
