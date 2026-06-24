// Program to check whether a given year is a leap year or not

class Logic
{
    void CheckLeapYear(int Year)
    {
        if ((Year % 4) == 0 && (Year % 100) != 0 )
        {
            System.out.println("It is a leap year");
        }
        else if(Year % 400 == 0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }   
    }
}

class program11
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckLeapYear(1600);
    }
}