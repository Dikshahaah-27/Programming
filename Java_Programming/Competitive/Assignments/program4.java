// Program to find the minimum of three numbers

class Logic
{
    void FindMin(int iNum1, int iNum2, int iNum3)
    {
        if(iNum1 < iNum2)
        {
            if(iNum1 < iNum3)
            {
                System.out.println(iNum1+" is minimum");
            }
            else
            {
                System.out.println(iNum3+" is minimum");
            }
        }
        else
        {
            System.out.println(iNum2+" is minimum");
        }
    }    
}

class program4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMin(1, 7, 2);
    }
}