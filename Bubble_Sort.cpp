// #include<stdio.h>
#include<iostream>
using namespace std;
void printArray(int *a,int n)
{
    for(int i=0;i<n;i++)
    {
        // printf("%d ",a[i]);
        cout<<a[i]<<" ";
    }
    // printf("\n");
    cout<<endl;
}

void bubbleSort(int *a,int n)
{
    int temp;
    for(int j=0;j< n-1;j++)
    {
        for(int i=0;i< n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
}
void bubbleSortAdaptive(int *a,int n)
{
    int temp;
    int isSorted=1;
    for(int j=0;j< n-1;j++)
    // for number of pass
    {
        // printf("Working on pass number " %d\n",j+1)
        cout<<"Program working on pass number "<<j+1<<endl;
        for(int i=0;i< n-1;i++)
        // for comparison in each pass
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                isSorted=0;
            }
        }
        if(isSorted)
        {
            return;
        }
    }
}
int main()
{
    printf("We are learning about Algorithms\n");
     int array[6] ={30,60,10,50,20,40};
    int n=6;
    printArray(array,n);
    bubbleSortAdaptive(array,n);
    printArray(array,n);
    return 0;
}