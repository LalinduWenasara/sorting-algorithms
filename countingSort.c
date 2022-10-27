#include<stdio.h>
#include<stdlib.h>

int getMax(int a[], int n)
{
	int max = 0;
	for(int i=0;i<n;i++)
	{
		if(a[i] > max)
		{
			max = a[i];
		}
	}
	return max;
}

void CountSort(int a[], int n, int k)
{
	int b[n];
	int count[k+1];
	for(int i=0;i<k+1;i++) //initialising count array.
	{
		count[i] = 0;
	}
	for(int i=0;i<n;i++) //initialising b array
	{
		b[i] = 0;
	}
	for(int i=0;i<n;i++)
	{
		count[a[i]]++;
	}
	for(int i=0;i<=k;i++)
	{
		count[i] = count[i] + count[i-1];
	}
	for (int i = n - 1; i >= 0; i--) 
	{
    	b[count[a[i]] - 1] = a[i];
    	count[a[i]]--;
	}
	for(int i=0;i<n;i++)
	{
		a[i] = b[i];
	}
}

void printarray(int arr[], int n)
{
	for(int i=0;i<n;i++)
		printf("%d ",arr[i]);
	putchar('\n');
}

void main()
{
    int arr[]={5,4,3,1,2,0};
	int n = sizeof(arr)/sizeof(arr[0]);
	int k = getMax(arr,n);
	CountSort(arr,n,k);
    printf("The Sorted Array: ");
    printarray(arr,n);
}