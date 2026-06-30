/*
    Accept N numbers from user and accept one another number as No and check whether no is present or not

    Input :     N : 6
                No : 66
                Elements : 85   66  3   66  93  88  

    Output : TRUE    
    
    Input :     N : 6
                No : 12
                Elements : 85   11  3   15  11  111  

    Output : FALSE       


*/

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            return TRUE;
        }
    }

    return FALSE;
}

int main()
{
    int iLength = 0, iCnt = 0, iValue = 0;
    BOOL bRet = FALSE;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&iLength);

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    p = (int *)malloc(iLength * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements : \n",iLength);

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("Enter element %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    bRet = Check(p, iLength, iValue);

    if(bRet == TRUE)
    {
        printf("TRUE");
    }
    else
    {
        printf("FALSE");
    }

    free(p);

    return 0;
}