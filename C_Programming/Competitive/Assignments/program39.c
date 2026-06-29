/*
    Accept temperature in Fahrenheit and convert it into celsius
    (1 Celsius = (Fahrenheit - 32) * (5/9))

    Input : 10
    Output : -12.2222   (10 - 32) * (5/9)

    Input : 34
    Output : 1.11111    (34 - 32) * (5/9)

*/

#include<stdio.h>

double FhToCs(float fTemp)
{
    double dCelsius = 0.0;

    dCelsius = ((fTemp - 32)*(5.0/9.0));

    return dCelsius;
}    

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit : \n");
    scanf("%f",&fValue);

    dRet = FhToCs(fValue);

    printf("Temperature in Celsius is : %lf",dRet);

    return 0;
}