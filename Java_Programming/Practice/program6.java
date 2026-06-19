import java.util.*;

class program6
{
    static float AddTwoNumbers(float fNo1, float fNo2)
    {
        float fAns = 0.0f;

        fAns = fNo1 + fNo2;

        return fAns;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float fValue1 = 0.0f;                   // To store first input
        float fValue2 = 0.0f;                   // To store second input
        float fResult = 0.0f;                   // To store the result

        System.out.println("Enter first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        fValue2 = sobj.nextFloat();

        fResult = AddTwoNumbers(fValue1, fValue2);            // To perform the addition

        System.out.println("Addition is : "+fResult);
    }
}


