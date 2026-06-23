// Program to check whether a number is palindrome or not

class Logic
{
    void CheckPalindrome(int iNum)
    {
        int iCnt = 0, iDigit = 0, iRev = 0;

        int iTemp = iNum;

        for(iCnt = 1; iCnt <= 3; iCnt++)
        {
            iDigit = iNum % 10;

            iRev = iRev * 10 + iDigit;
            
            iNum = iNum / 10;
        }

        if(iRev == iTemp)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }   
    }
}

class program2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);
    }
}