//Program to check whether a number is divisible by 5 and 11 or not

class Logic
{
    void CheckDivisible(int Num)
    {
        if((Num % 5) == 0 && (Num % 11) == 0)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}

class program13
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckDivisible(110);
    }
}
