// Program to find the sum of even and odd digits seperately in a number

class Logic
{
    void SumEvenOddDigits(int iNum)
    {
        int iCnt = 0, iSumEven = 0, iSumOdd = 0, iDigit = 0;

        for(iCnt = 1; iCnt <= 6; iCnt++)
        {
            iDigit = iNum % 10;

            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNum = iNum / 10;
        }

        System.out.println("Summation of even digits is : "+iSumEven);
        System.out.println("Summation of odd digits is : "+iSumOdd);
    }
}

class program9
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.SumEvenOddDigits(123456);
    }
}