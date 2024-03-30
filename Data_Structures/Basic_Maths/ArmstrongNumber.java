/*
 Problem Statement: Given a number, check if it is Armstrong Number or Not.

Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

 */
package Data_Structures.Basic_Maths;

public class ArmstrongNumber {
    public static boolean check(int n)
    {
        int originalno = n;
        int count = 0;
        int temp = n;
        while (temp != 0)
        {
            count++;
            temp = temp / 10;
        }
        int sumofpower = 0;
        while (n != 0)
        {
            int digit = n % 10;
            sumofpower += Math.pow(digit,count);
            n /= 10;
        }
        return (sumofpower == originalno);
    }
    public static void main(String args[])
    {
        int n1 = 153;
        if (check(n1))
        {
            System.out.println("Yes, it is an Armstrong Number\n");
        }
        else
        {
            System.out.println("No, it is not an Armstrong Number\n");
        }
        
    }
}//Time complexity:O(n), Space complexity: O(1)
