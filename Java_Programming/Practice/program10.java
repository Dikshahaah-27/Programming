import java.util.*;

class program10
{
    static void CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        CheckEvenOdd(iValue);

    }
}