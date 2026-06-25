// Program to display all factors of a given number

class Logic
{
    void DisplayFactors(int Num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= Num; iCnt++)
        {
            if((Num % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program23
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.DisplayFactors(12);
    }
}