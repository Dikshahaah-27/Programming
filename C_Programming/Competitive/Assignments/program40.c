/*
    Accept area in square feet and convert it into square meter
    (1 Square Feet = 0.0929 Square Meter)

    Input : 5
    Output : 0.464515

    Input : 7
    Output : 0.650321

*/

#include<stdio.h>

double SquareMeter(int iNo)
{
    double dArea = 0.0;

    dArea = iNo * 0.0929;

    return dArea;
}    

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : \n");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is : %lf",dRet);

    return 0;
}