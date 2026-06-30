/*
    Accept N numbers from user and return difference between frequency of even numbers and odd numbers

    Input :     N : 7
                Elements : 85   66  3   80  93  88  90

    Output : 1  (4-3)            

*/

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iSize)
{
    int iCnt = 0, iEven = 0, iOdd = 0, iDiff = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEven++;
        }
        else
        {
            iOdd++;
        }
    }

    iDiff = iEven - iOdd;

    return iDiff;
}

int main()
{
    int iLength = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&iLength);

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

    iRet = Frequency(p, iLength);

    printf("Difference between frequency of even and odd elements is  : %d",iRet);

    free(p);

    return 0;
}