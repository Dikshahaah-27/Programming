// Program to print all the odd numbers upto N

class Logic
{
    void PrintOddNumbers(int iNum)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program8
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.PrintOddNumbers(20);
    }
}