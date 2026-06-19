/////////////////////////////////////////////////////////////////////
//
//  Include required packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

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

class program8
{
    static float AddTwoNumbers(
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

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float fValue1 = 0.0f;                   // To store first input
        float fValue2 = 0.0f;                   // To store second input
        float fResult = 0.0f;                   // To store the result

        System.out.println("Enter first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        fValue2 = sobj.nextFloat();

        fResult = AddTwoNumbers(fValue1, fValue2);            // To perform the addition

        System.out.println("Addition is : "+fResult);
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Input :      10.0    11.0
//  Output :     21.0
//
/////////////////////////////////////////////////////////////////////