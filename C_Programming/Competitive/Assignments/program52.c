/*
    Accept a number from user and check whether it contains zero in it or not

    Input : 2395
    Output : There is no zero

    Input : 1018
    Ouput : It contains zero
            
    Input : 9000
    Output : It contains zero

    Input : 10687
    Output : It contains zero

*/          

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        
        if(iDigit == 0)
        {
            return TRUE;
        }
        
        iNo = iNo / 10;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    bRet = ChkZero(iValue);

    if(bRet == TRUE)
    {
        printf("It contains zero");
    }
    else
    {
        printf("There is no zero");
    }

    return 0;
}