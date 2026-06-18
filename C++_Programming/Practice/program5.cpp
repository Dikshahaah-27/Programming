#include<iostream>
using namespace std;

int main()
{
    float fValue1 = 0.0f;                   // To store first input
    float fValue2 = 0.0f;                   // To store second input
    float fResult = 0.0f;                   // To store the result

    cout<<"Enter first number : \n";
    cin>>fValue1;

    cout<<"Enter second number : \n";
    cin>>fValue2;

    fResult = fValue1 + fValue2;            // To perform the addition
    
    cout<<"Addition is : \n"<<fResult;  

    return 0;
}