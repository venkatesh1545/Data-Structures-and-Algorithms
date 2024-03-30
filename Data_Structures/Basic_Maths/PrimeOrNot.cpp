/*
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. For example 2, 3, 5, 7, 11,….. are prime numbers.

*/
#include <iostream>  
using namespace std;  
int main()  
{  
    int n, i, m=0, flag=0;  
    cout << "Enter the Number to check Prime: ";  
    cin >> n;  
    m=n/2;  
    for(i = 2; i <= m; i++)  
    {  
        if(n % i == 0)  
        {  
            cout<<"Number is not Prime."<<endl;  
            flag=1;  
            break;  
        }  
    }  
    if (flag==0)
        cout << "Number is Prime."<<endl;  
    return 0;  
}  