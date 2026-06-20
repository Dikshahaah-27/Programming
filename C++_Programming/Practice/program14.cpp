#include<iostream>
using namespace std;

int CalculateTicketPrice(int Age)
{
    if(Age >= 0 && Age <= 5)
    {
        return 0;
    }
    else if(Age >= 6 && Age <= 18)
    {
        return 500;
    }
    else if(Age >= 19 && Age <= 50)
    {
        return 900;
    }
    else
    {
        return 400;
    }
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    cout<<"Please enter your age to calculate the ticket price : ";
    cin>>iValue;

    iRet = CalculateTicketPrice(iValue);

    cout<<"Your ticket price will be  "<<iRet<<" rupees";

    return 0;
}