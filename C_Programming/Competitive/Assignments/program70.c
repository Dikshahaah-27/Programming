/*
    Accept N numbers from user and return product of all odd numbers

    Input :     N : 6
                Elements : 15   66   3   70  10  88  

    Output : 45

    Input :     N : 6
                Elements : 44   66   72   70  10  88  

    Output :  0

*/

#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[], int iSize)
{
    int iCnt = 0, iProduct = 0, iFlag = 0;

    for(iCnt = 0, iProduct = 1; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) != 0)
        {
            iProduct = iProduct * Arr[iCnt];
            iFlag = 1;
        }
    }

    if(iFlag == 0)
    {
        return 0;
    }

    return iProduct;
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

    iRet = Product(p, iLength);

    printf("The product of all odd numbers is : %d",iRet);

    free(p);

    return 0;
}