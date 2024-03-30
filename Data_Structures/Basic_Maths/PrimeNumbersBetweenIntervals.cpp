/*
Problem statement:
Given two numbers  a and b as interval range, the task is to find the prime numbers in between this interval.

Examples: 

Input : a = 1, b = 10
Output : 2, 3, 5, 7
Input : a = 10, b = 20
Output : 11, 13, 17, 19

*/
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, b, i, j, flag;
    cout << "Enter lower bound of the interval: ";
    cin >> a;
    cout << "\nEnter upper bound of the interval: ";
    cin >> b;
    cout << "\nPrime numbers between "<< a << " and " << b << " are: ";
    for (i = a; i <= b; i++) {
        if (i == 1 || i == 0)
            continue;
        flag = 1;
 
        for (j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            cout << i << " ";
    }
    return 0;
}