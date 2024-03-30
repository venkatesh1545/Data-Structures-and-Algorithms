/*
Problem statement:
Given a positive integer N, the task is to check if N is a strong prime or not. 
In number theory, a strong prime is a prime number that is greater than the arithmetic mean of nearest prime numbers i.e next and previous prime numbers. 
First few strong prime numbers are 11, 17, 29, 37, 41, 59, 67, 71, … 

Examples:
Input: N = 11 
Output: Yes 
11 is 5th prime number, the arithmetic mean of 4th and 6th prime number i.e. 7 and 13 is 10. 
11 is greater than 10 so 11 is a strong prime. 

Input: N = 13 
Output: No 
13 is 6th prime number, the arithmetic mean of 5th (11) and 7th (17) is (11 + 17) / 2 = 14. 
13 is smaller than 14 so 13 is not a strong prime.
*/
#include <bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
    if (n <= 1)
        return false;
    if (n <= 3)
        return true;
 
    if (n % 2 == 0 || n % 3 == 0)
        return false;
 
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
 
    return true;
}
static bool isStrongPrime(int n)
{
    if (!isPrime(n) || n == 2)
        return false;
    int previous_prime = n - 1;
    int next_prime = n + 1;
    while (!isPrime(next_prime))
        next_prime++;
    while (!isPrime(previous_prime))
        previous_prime--;
    int mean = (previous_prime + next_prime) / 2;
    if (n > mean)
        return true;
    else
        return false;
}
int main()
{
    int n;
    cout<<"Enter a value"<<endl;
    cin>>n;
    if (isStrongPrime(n))
        cout << "Yes";
    else
        cout << "No";
    return 0;
}

//Time complexity:O(sqrt(n)), space complexity:O(1)
