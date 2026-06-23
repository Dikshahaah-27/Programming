// Program to check whether a number is prime or not

class Logic
{
    boolean CheckPrime(int iNum)
    {
        int iCnt = 0;

        if(iNum <= 1)
        {
            return true;
        }

        for(iCnt = 2; iCnt < iNum; iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                return true;
            }
        }
        return false;
    }
}

class program6
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        boolean bRet = false;

        bRet = lobj.CheckPrime(13);

        if(bRet == true)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
    }
}