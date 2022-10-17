package selection_sort;

import java.util.Scanner;

public class Selection_sort {
    
    public static void main(String[] args) {
         
        int length, i, j, tempo;  
       int arr[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter your Size of Array : ");  
       length= scan.nextInt();  
         
       System.out.print("Enter Your Inputs: ");  
       for(i=0; i<length; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
       
       for(i=0; i<length; i++)  
       {  
           for(j=i+1; j<length ; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   tempo = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = tempo;  
               }  
           }  
       }  
         
       System.out.print("Sorted Array result is :\n");  
       for(i=0; i<length; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  