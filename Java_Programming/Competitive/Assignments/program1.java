// Program to find the sum of all the digits of a number

class Logic
{
    void SumOfDigits(int iNum)
    {
        int iDigit = 0, iSum = 0, iCnt = 0;

        for(iCnt = 1; iCnt <= 4; iCnt++)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }
        
        System.out.println("Summation of digits is : "+iSum);
    }
}

class program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(8765);
    }
}