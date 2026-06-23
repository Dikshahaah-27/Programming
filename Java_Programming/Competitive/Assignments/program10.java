// Program to check whether a number is positive, negative or zero

class Logic
{
    void CheckSign(int iNum)
    {
        if(iNum < 0)
        {
            System.out.println("Number is negative");
        }
        else if(iNum == 0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Number is positive");
        }
    }
}

class program10
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckSign(-8);
    }
}