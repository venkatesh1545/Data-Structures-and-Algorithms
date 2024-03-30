/*
 Problem statement: sum of first n natural numbers in java.
 Example:
 Input: 10
 output = 55
 Explanation: 1+2+3+4+5+6+7+8+9+10 = 55

 Example-2: 
 input: 5
 output: 15
 Explanation: 1+2+3+4+5=15
 */
package Data_Structures.Basic_Recursion;

public class SumOfFirstN_Numbers {
    public static int sum(int n){
        if(n == 0) return 0;
        else return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);
    }
}
