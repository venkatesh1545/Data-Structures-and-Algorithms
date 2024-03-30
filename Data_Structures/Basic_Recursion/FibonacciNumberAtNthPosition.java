/*
 * Problem Statement: Find the Fibonacci number at Nth position.
 * Exmple:
 * input: n=10
 * output: 55
 */
package Data_Structures.Basic_Recursion;

public class FibonacciNumberAtNthPosition {
    public static int fibonacci(int n) {
        // Base cases: if n is 0 or 1, Fibonacci number is n
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: Fibonacci number is the sum of the previous two Fibonacci numbers
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
//time complexity: O(2^n)