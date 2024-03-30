/* 
Problem Statement: Given a number N reverse the number and print it.
Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

How to extract digits from the end of a number?

To extract the last digit, if you divide a number by 10, then the remainder will be the last digit. We can simply use the modulo(%) operator to do this, for example the last digit of 123 will be (123 % 10), which is 3.
To reduce the number by one digit from the end, simply divide the number by 10. example: to reduce 123 to 12, simply do (123/10) which is equal to 12.
To create a number from digits: The idea is to start with 0, and for every digit, multiply the number generated so far by 10, and add the digit to it.
For example, to create a number from digits: [1,2,3]:
Consider the number, num = 0.
Then,

For first digit: 1
num = num*10 + 1 = 0*10 + 1 = 1;

For second digit: 2
num = num*10 + 2 = 1*10 + 2 = 12;

For third digit: 3
num = num*10 + 2 = 12*10 + 3 = 123;
*/
package Data_Structures.Basic_Maths;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 123;
        int num = n;
        int reverse = 0;
        
        while(n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        
        System.out.printf("The reverse of %d is %d", num, reverse);
    }
}
//Time complexity: O(n), space complexity: O(1)
