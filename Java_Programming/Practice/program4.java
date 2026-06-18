/*
    Algorithm

    START
        Accept first number as No1
        Accept second number as No2
        Perform addition of No1 & No2
        Display the result
    STOP
*/

import java.util.*;

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float i = 0.0f, j = 0.0f, k = 0.0f;         // Variable creation with default values

        System.out.println("Enter first number : ");
        i = sobj.nextFloat();

        System.out.println("Enter second number : ");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is : "+k);

    }
}

