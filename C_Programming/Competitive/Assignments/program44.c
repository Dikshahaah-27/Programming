/*
    Accept number from user and return multiplication of all digits

    Input : 2395
    Output : 270

    Input : 1018
    Output : 8

    Input : 9440
    Output : 144

    Input : 922432
    Output : 864

*/

#include<stdio.h>

int MultiDigits(int iNo)
{
    int iMul = 0, iDigit = 0;

    iMul = 1;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iMul = iMul * iDigit;     
        iNo = iNo / 10;
    }
    
    return iMul;
}    

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = MultiDigits(iValue);

    printf("Multiplication of the digits is : %d",iRet);

    return 0;
}