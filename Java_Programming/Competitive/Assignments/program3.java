// Program to find the maximum of two numbers

class Logic
{
    void FindMax(int iNum1, int iNum2)
    {
        if(iNum1 > iNum2)
        {
            System.out.println(iNum1+" is maximum");
        }
        else
        {
            System.out.println(iNum2+" is maximum");
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20, 15);
    }
}