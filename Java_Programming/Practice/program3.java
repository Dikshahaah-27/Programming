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

public class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float i,j,k;

        System.out.println("Enter first number : ");
        i = sobj.nextFloat();

        System.out.println("Enter second number : ");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is : "+k);

    }
}

