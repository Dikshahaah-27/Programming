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

import java.util.*;

class program9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRemainder = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRemainder = iValue % 2;

        if(iRemainder == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}