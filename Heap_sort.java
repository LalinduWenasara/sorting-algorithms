
package heap_sort;

public class Heap_sort {

    public void sorting(int arr[])
    {
        int m = arr.length;
 
        for (int i = m/ 2 - 1; i >= 0; i--)
            heapif(arr, m ,i);
  
        for (int i=m-1; i>=0; i--)
        {
            int tempo = arr[0];
            arr[0] = arr[i];
            arr[i] = tempo;
  
            heapif(arr, i, 0);
        }
    }
  
    void heapif(int arr[], int n, int i)
    {
        int larg = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2; 
  
        if (l < n && arr[l] > arr[larg])
            larg= l;
  
        if (r < n && arr[r] > arr[larg])
            larg = r;
  
        if (larg != i)
        {
            int swap = arr[i];
            arr[i] = arr[larg];
            arr[larg] = swap;
  
            heapif(arr, n ,larg);
        }
    }
  
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
        int arr[] = {20,55,2,45,354,34,10,12,5,438,67};
        int n = arr.length;
  
        Heap_sort ob = new Heap_sort();
        ob.sorting(arr);
  
        System.out.println("Your Sorted Array is: ");
        printArray(arr);
    }
}
