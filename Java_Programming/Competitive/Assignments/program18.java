// Program to check whether a number is a perfect number or not

class Logic
{
    void CheckPerfect(int Num)
    {
        int iCnt = 0, iResult = 0;

        for(iCnt = 1; iCnt <= Num / 2; iCnt++)
        {
            if(Num % iCnt == 0)
            {
                iResult = iResult + iCnt;
            }
        }

        if(iResult == Num)
        {
            System.out.println(Num+" is a perfect number");
        }
        else
        {
            System.out.println(Num+" is not a perfect number");
        }
    }
}

class program18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckPerfect(28);
    }
}
