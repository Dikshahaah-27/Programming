/////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
/////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

/////////////////////////////////////////////////////////////////////
//
//  Function Name : AddTwoNumbers
//  Input :         float, float
//  Output :        float 
//  Description :   Performs addition of 2 floats
//  Date :          08/05/2026
//  Author :        Diksha Vinod Dhage
//
/////////////////////////////////////////////////////////////////////

float AddTwoNumbers(
                        float fNo1,          // First input
                        float fNo2           // Second input                                  
                   )
{
    float fAns = 0.0f;                       // Variable to store result

    fAns = fNo1 + fNo2;                      // Perform Addition

    return fAns;
}

//////////////////////////////////////////////////////////////////////
//
//  Application to perform Addition of 2 float values
//
//////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////
//
//  Input :      10.0    11.0
//  Output :     21.0
//
/////////////////////////////////////////////////////////////////////