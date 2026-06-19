/*
    START
        Accept number as No
        If No is completely divisible by 2
            then print Even
        Otherwise
            print Odd
    STOP


    START
        Accept number as No
        Divide No by 2
        If remainder is 0
            then print as Even
        Otherwise
            print as Odd
    STOP
*/

#include<iostream>
using namespace std;

int main()
{
    int iValue = 0;
    int iRemainder = 0;

    cout<<"Enter number : \n";
    cin>>iValue;

    iRemainder = iValue % 2;

    if(iRemainder == 0)
    {
        cout<<"Number is Even\n";
    }
    else
    {
        cout<<"Number is Odd\n";
    }

    return 0;
}