#include<iostream>
using namespace std;

int CheckEvenOdd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    return iRemainder;
}

int main()
{
    int iValue = 0, iRet = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    iRet = CheckEvenOdd(iValue);

    if(iRet == 0)
    {
        cout<<"Number is even";
    }
    else
    {
        cout<<"Number is odd";
    }

    return 0;
}