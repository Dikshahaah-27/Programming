/*
    Accept radius of circle from user and calculate its area
    Consider value of PI as 3.14 (Area = PI * Radius * Radius)

    Input : 5.3
    Output : 88.2026

    Input : 10.04
    Ouput : 339.6224

*/

#include<stdio.h>

double CircleArea(float fRadius)
{
    double dArea = 0.0;
    const float PI = 3.14;

    dArea = PI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter Radius : \n");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of a circle is : %lf",dRet);

    return 0;
}