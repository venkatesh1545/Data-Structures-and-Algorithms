/*
 GCD (i.e. Greatest Common Divisor) or HCF (i.e. Highest Common Factor) is the largest number that can divide both the given numbers.
 x= 36  ==>2x2x3x3
 y= 60  ==>2x2x2x3x5
 gcd = multiplication of common factors
      = 2x2x3
      = 12
 */
package Data_Structures.Basic_Maths;

public class GCDNumber {
    static int GCD(int x, int y) 
    { 
        if (y == 0) 
            return x; 
        return GCD(y, x % y); 
    } 
    public static void main(String[] args) 
    { 
        int x = 36, y = 60; 
        System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y)); 
    } 
}
