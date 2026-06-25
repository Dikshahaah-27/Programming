// Program to calculate the product of digits of a number

class Logic
{
    void ProductOfDigits(int Num)
    {
        int iDigit = 0, iProduct = 1;

        while(Num != 0)
        {
            iDigit = Num % 10;

            iProduct = iProduct * iDigit;

            Num = Num / 10;
        }

        System.out.println("Product of digits of a number is : "+iProduct);
    }
}

class program21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.ProductOfDigits(234);
    }
}
