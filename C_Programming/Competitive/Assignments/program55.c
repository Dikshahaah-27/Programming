/*
    Accept a number from user and count frequency of digits less than 6

    Input : 2395
    Output : 3

    Input : 1018
    Ouput : 3
            
    Input : 9440
    Output : 3

    Input : 96672
    Output : 1

*/          

#include<stdio.h>

int Count(int iNo)
{
    int iDigit = 0, iCount = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        
        if(iDigit < 6)
        {
            iCount++;
        }
        
        iNo = iNo / 10;
    }

    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Count(iValue);

    printf("Frequency of digits less than 6 is : %d",iRet);

    return 0;
}