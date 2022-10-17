
package radix_sort;

import java.util.Arrays;


public class Radix_sort {
    
    static int getMaximum(int arr[], int m)
    {
        int max= arr[0];
        for (int i = 1; i < m; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    
    static void countingSort(int arr[], int n, int expo)
    {
        int output[] = new int[n]; 
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        for (i = 0; i < n; i++)
            count[ (arr[i]/expo)%10 ]++;
 
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/expo)%10 ] - 1] = arr[i];
            count[ (arr[i]/expo)%10 ]--;
        }
        
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
 
    static void radixSort(int arr[], int n)
    {
        int m = getMaximum(arr, n);
 
        for (int expo = 1; m/expo > 0; expo *= 10)
            countingSort(arr, n, expo);
    }
 
    static void printing(int arr[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.println(arr[i]+" ");
    }
    
    public static void main(String[] args) {
       int arr[] = {100, 54, 120, 8, 80, 248, 12, 508,412,33};
        int n = arr.length;
        radixSort(arr, n);
        System.out.println("Sorted Array is: ");
        printing(arr, n);
    }
}
