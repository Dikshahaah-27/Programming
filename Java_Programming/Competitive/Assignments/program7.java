// Program to print all the even numbers upto N

class Logic
{
    void PrintEvenNumbers(int iNum)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program7
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.PrintEvenNumbers(20);
    }
}