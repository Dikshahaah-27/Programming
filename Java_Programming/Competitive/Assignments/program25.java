// Program to print all numbers from 1 to N that are divisible by both 2 and 3

class Logic
{
    void PrintDivisibleBy2And3(int Num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= Num; iCnt++)
        {
            if((iCnt % 2) == 0 && (iCnt % 3) == 0) 
            {
                System.err.println(iCnt);
            }
        }
    }
}

class program25
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.PrintDivisibleBy2And3(30);
    }
}
