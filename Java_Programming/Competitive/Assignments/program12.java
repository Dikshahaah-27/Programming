// Program to display the grade of a student based on marks

class Logic
{
    void DisplayGrade(int Marks)
    {
        if(Marks <= 100 && Marks >= 80)
        {
            System.out.println("O Grade");
        }
        else if(Marks <= 79 && Marks  >= 70)
        {
            System.out.println("A Grade");
        }
        else if(Marks <= 69 && Marks >= 60)
        {
            System.out.println("B Grade");
        }
        else if(Marks <= 59 && Marks >= 50)
        {
            System.out.println("C Grade");
        }
        else if(Marks <= 49 && Marks >= 40)
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("FAIL");
        }   
    }
}

class program12
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}
