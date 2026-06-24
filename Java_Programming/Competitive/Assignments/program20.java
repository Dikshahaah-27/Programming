// Program to find the smallest digit in a given number

class Logic
{
    void FindSmallestDigit(int Num)
    {
        int iDigit = 0;
        int iMin = Num % 10;

        while(Num != 0)
        {
            iDigit = Num % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            Num =  Num / 10;
        }

        System.out.println("The Smallest digit in the given number is : "+iMin);
    }
}

class program20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.FindSmallestDigit(45872);
    }
}
