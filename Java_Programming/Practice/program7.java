import java.util.*;

class program7
{
    static float AddTwoNumbers(
                        float fNo1,          // First input
                        float fNo2           // Second input                                  
                   )
    {
        float fAns = 0.0f;                       // Variable to store result

        fAns = fNo1 + fNo2;                      // Perform Addition

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


