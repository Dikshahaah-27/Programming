/*
    Accept one number from user and return the difference between Even factorial and Odd factorial of the given number 

    Input : 5
    Output : -7      (8 - 15)

    Input : -5
    Output : -7      (8 - 15)

    Input : 10
    Output : 2895   (3840 - 945)

*/ 

#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0, iEvenFact = 0, iOddFact = 0, iDiff = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1, iDiff = 1, iEvenFact = 1, iOddFact = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 !=  0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }

    iDiff = iOddFact - iEvenFact;

    return iDiff;
    
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference is : %d",iRet);

    return 0;
}