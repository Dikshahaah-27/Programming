/*
    Accept number from user and return addition of all even numbers in between that range.
    (Range should contain positive numbers only)

    Input : 23  30
    Output : 108

    Input : 10  18
    Output : 70

    Input : -10 2
    Output : Invalid Range

    Input : 90  18
    Output : Inavlid Range

*/

#include<stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    int iCnt = 0, iSum = 0;

    if(iStart > iEnd || iStart < 0 || iEnd < 0)
    {
        return -1;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    return iSum;
}    

int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iRet =  0;

    printf("Enter starting point : \n");
    scanf("%d",&iValue1);

    printf("Enter ending point : \n");
    scanf("%d",&iValue2);
    
    iRet = RangeSumEven(iValue1, iValue2);

    if(iRet == -1)
    {
        printf("Invalid Range");
    }
    else
    {
        printf("Addition is : %d",iRet);
    }

    return 0;
}