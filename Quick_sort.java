//Quick sort 
import java.util.*;
class Main  
{
    static int arr[] = new int[500000];
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter The number of elements:");
        int n = input.nextInt();
        System.out.println("1.Best case\n2.Average case\n3.Worst case");
        int ch = input.nextInt(),i;
        switch(ch)
        {
            case 1:
                for(i=0;i<n;i++)
                {
                    arr[i] = n-i;
                }
                break;
            case 2:
                for(i=0;i<n;i++)
                {
                    arr[i] = r.nextInt(n);
                }
                break;
            case 3:
                for(i=0;i<n;i++)
                {
                    arr[i] = i;
                }
                break;
        }
        double start = System.nanoTime();
        quicksort(arr,0,n-1);
        double end = System.nanoTime();
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Time elapsed:"+(end-start)/1_000_000_000);
    }
    
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[low],i = low,j = high;
        while(i<j)
        {
            while((arr[i]<=pivot)&&(i<high))
            {
                i++;
            }
            while((arr[j]>=pivot)&&(j>low))
            {
                j--;
            }
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] =  pivot;
        return j;
    }
}

