import java.util.*;

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0, j = 0, k = 0;

        System.out.println("Enter first number : ");
        i = sobj.nextInt();

        System.out.println("Enter second number : ");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : "+k);
    }
}
