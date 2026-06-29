/*
    Accept distance in kilometer and convert it into meter
    (1 Kilometer = 1000 Meter)

    Input : 5
    Output : 5000

    Input : 12
    Output : 12000

*/

#include<stdio.h>

int KMToMeter(int iNo)
{
    int iMeter = 0;

    iMeter = iNo * 1000;

    return iMeter;    
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Distance : \n");
    scanf("%d",&iValue);

    iRet = KMToMeter(iValue);

    printf("Distance in meter is : %d",iRet);

    return 0;
}