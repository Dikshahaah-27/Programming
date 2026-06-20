import java.util.*;

class Logic
{
    int CalculateTicketPrice(int iAge)
    {
        // Input Updater
        if(iAge < 0)
        {
            iAge = -iAge;
        }

        if(iAge >= 0 && iAge <= 5)
        {
            return 0;
        }
        else if(iAge >= 6 && iAge <= 18)
        {
            return 500;
        }
        else if(iAge >= 19 && iAge <= 50)
        {
            return 900;
        }
        else
        {
            return 400;
        }
    }
}

class program15
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter your age to calculate the ticket price : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.CalculateTicketPrice(iValue);

        System.out.println("Your ticket price will be "+iRet+" rupees");
    }
}