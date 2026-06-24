// Program to calculate the power of a number using loops

class Logic
{
    void CalculatePower(int Base, int Exp)
    {
        int iCnt = 0, Result = 0;

        for(iCnt = 1, Result = 1; iCnt <= Exp; iCnt++)
        {
            Result = Result * Base;
        }

        System.out.println(Result);
    }
}

class program15
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CalculatePower(2, 5);
    }
}