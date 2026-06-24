// Program to print each digit of a number seperately

class Logic
{
    void PrintDigits(int Num)
    {
        int iDigit = 0;

        while (Num != 0)
        {
            iDigit = Num % 10;
            
            System.out.println(iDigit);

            Num = Num / 10;
        }
    }
}

class program14
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.PrintDigits(9876);
    }
}