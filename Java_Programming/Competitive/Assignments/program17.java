// Program to print numbers from N down to 1 in reverse order

class Logic
{
    void PrintReverse(int Num)
    {
        int iCnt = 0;

        for(iCnt = Num; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class program17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.PrintReverse(10);
    }
}