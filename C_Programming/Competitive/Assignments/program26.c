/*
    Accept a number from user and if the number is less than 50 then print "small",
    if it is greater than 50 and less than 100, print "medium" and 
    if it is greater than 100,  print "large"

    Input : 75
    Output : Medium

*/ 
#include<stdio.h>

void Number(int iNo)
{
    if(iNo <= 50)
    {
        printf("Small");
    }
    else if(iNo >= 50 && iNo <= 100)
    {
        printf("Medium");
    }
    else
    {
        printf("Large");
    }

    printf("\n");
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Number(iValue);

    return 0;
}