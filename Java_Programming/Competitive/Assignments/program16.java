// Program to find sum of all even numbers upto N

class Logic
{
    void SumEvenNumbers(int Num)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= Num; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Summation of even numbers is : "+iSum);
    }
}

class program16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.SumEvenNumbers(10);
    }
}