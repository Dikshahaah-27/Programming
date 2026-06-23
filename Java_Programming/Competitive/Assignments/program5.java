// Program to print the multiplication table of a number

class Logic
{
    void PrintTable(int iNum)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNum+" * "+iCnt+" = "+(iNum * iCnt));
        }
    }
}

class program5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}