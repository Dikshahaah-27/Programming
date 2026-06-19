#include<iostream>
using namespace std;

float AddTwoNumbers(float fNo1, float fNo2)
{
    float fAns = 0.0f;

    fAns = fNo1 + fNo2;

    return fAns;
}

int main()
{
    float fValue1 = 0.0f;                   // To store first input
    float fValue2 = 0.0f;                   // To store second input
    float fResult = 0.0f;                   // To store the result

    cout<<"Enter first number : \n";
    cin>>fValue1;

    cout<<"Enter second number : \n";
    cin>>fValue2;

    fResult = AddTwoNumbers(fValue1, fValue2);            // To perform the addition
    
    cout<<"Addition is : "<<fResult;   

    return 0;
}