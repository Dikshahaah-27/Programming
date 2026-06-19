#include<iostream>
using namespace std;

void CheckEvenOdd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    if(iRemainder == 0)
    {
        cout<<"Number is Even\n";
    }
    else
    {
        cout<<"Number is Odd\n";
    }
}

int main()
{
    int iValue = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    CheckEvenOdd(iValue);

    return 0;
}