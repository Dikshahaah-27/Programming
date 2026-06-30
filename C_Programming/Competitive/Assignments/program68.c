/*
    Accept N numbers from user and accept one another number as No and return index of last occurrence of that No

    Input :     N : 6
                No : 66
                Elements : 85   66  3   66  93  88  

    Output : 3

    Input :     N : 6
                No : 93
                Elements : 85   66  3   66  93  88  

    Output : 4
    
    Input :     N : 6
                No : 12
                Elements : 85   11  3   15  11  111  

    Output : -1     


*/

#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[], int iSize, int iNo)
{
    int iCnt = 0, iIndex = -1;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iIndex = iCnt;
        }
    }

    return iIndex;
}

int main()
{
    int iLength = 0, iCnt = 0, iValue = 0, iRet = 0;
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

    iRet = LastOcc(p, iLength, iValue);

    if(iRet == -1)
    {
        printf("There is no such number");
    }
    else
    {
        printf("Last occurrence of the number is : %d",iRet);
    }

    free(p);

    return 0;
}