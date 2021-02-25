
package mergetwoarray;

import java.util.Scanner;

public class MergeTwoArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array 1 : ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = in.nextInt();
        }
        
        System.out.print("Enter the size of array 2 : ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = in.nextInt();
        }
        
        int n3 = n1+n2;
        int[] arr3 = new int[n3];
        arr3 = mergeArrays(arr1,arr2);
        sortArray(arr3);
        printArray(arr3);

    }
    
    public static int[] mergeArrays(int[] A, int[] B)
    {
        int n3 = A.length+B.length;
        int[] arr3 = new int[n3];
        
        int k = 0;
        for(int i = 0; i < A.length; i++)
        {
            arr3[k++] = A[i];
        }
        
        for(int j = 0; j < B.length; j++)
        {
            arr3[k++] = B[j];
        }
        
        return arr3;
    }
    
    public static void printArray(int[] arr)
    {
        for(int m = 0; m < arr.length; m++)
        {
            System.out.print(arr[m]+" ");
        }
    }
    
    public static void sortArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
