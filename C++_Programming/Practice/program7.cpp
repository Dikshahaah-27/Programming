#include<iostream>
using namespace std;

float AddTwoNumbers(
                        float fNo1,          // First input
                        float fNo2           // Second input                                  
                   )
{
    float fAns = 0.0f;                       // Variable to store result

    fAns = fNo1 + fNo2;                      // Perform Addition

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