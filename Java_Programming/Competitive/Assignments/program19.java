// Program to find the largest digit in a given number

class Logic
{
    void FindLargestDigit(int Num)
    {
        int iDigit = 0, iMax = 0;

        while(Num != 0)
        {
            iDigit = Num % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            Num = Num / 10;
        }

        System.out.println("The largest digit in the given number is : "+iMax);
    }
}

class program19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.FindLargestDigit(83429);
    }
}
