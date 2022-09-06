import java.util.*;
class Main   
{
    static int arr[] = new int[500000];
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the number of elements:");
        int n = input.nextInt(),i;
        System.out.println("1.Best case\n2.Average case\n3.Worst case");
        int ch = input.nextInt();
        switch(ch)
        {
            case 1:
                for(i=0;i<n;i++)
                {
                    arr[i] = i;
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
                    arr[i] = n-i;
                }
                break;
        }
        double start = System.nanoTime();
        mergesort(arr,0,n-1);
       double end = System.nanoTime();
        System.out.println("The sorted elements are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The elapsed time:"+(end-start)/1_000_000_000);
    }
    public static void mergesort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high)
    {
        int i = low,j = mid+1,k=low;
        int aux[] = new int[high+1];
        Arrays.fill(aux,0);
        while((i<=mid)&&(j<=high))
        {
            if(arr[i]<=arr[j])
            {
                aux[k++] = arr[i++];
            }
            else
            {
                aux[k++] = arr[j++];
            }
        }
        if(i>mid)
        {
            for(;j<=high;j++)
            {
                aux[k++] = arr[j];
            }
        }
        else
        {
            for(;i<=mid;i++)
            {
                aux[k++] = arr[i];
            }
        }
        for(k=low;k<=high;k++)
        {
            arr[k] = aux[k];
        }
    }
}

