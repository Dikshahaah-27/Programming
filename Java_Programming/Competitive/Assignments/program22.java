// Program to count how many even and odd numbers are present between 1 and N

class Logic
{
    void CountEvenOddrange(int Num)
    {
        int iCnt = 0, iCountEven = 0, iCountOdd = 0;

        for(iCnt = 1; iCnt <= Num; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Total number of even numbers are : "+iCountEven);
        System.out.println("Total number of odd numbers are : "+iCountOdd);
    }
}

class program22
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CountEvenOddrange(50);
    }
}
