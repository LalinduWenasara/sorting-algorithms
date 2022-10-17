package bubble_sort;

public class Bubble_Sort {
    
    void Bubble_Sort(int arr[])
    {
        int number = arr.length;
        for (int i = 0; i < number-1; i++)
            for (int j = 0; j < number-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void pArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        
        Bubble_Sort ob = new Bubble_Sort();
        
        System.out.println("Enter Your Numbers:");
        int arr[] = {20,15,45,1,23,74,34,33,88,2,10};
        ob.Bubble_Sort(arr);
        System.out.println("Sorted array");
        ob.pArray(arr);
    }
}