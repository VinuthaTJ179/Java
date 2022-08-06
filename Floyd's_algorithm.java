//Floyd's Algorithm
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = input.nextInt(),i,j;
        System.out.println("Enter the cost-adjacency matrix: ");
        int arr[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        floyd(arr,n);
    }
    public static void floyd(int arr[][],int n)
    {
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
            for(k=0;k<n;k++)
            {
                if(arr[i][k]!=0 && arr[i][k]!=999)
                {
                if((arr[j][k])>(arr[j][i]+arr[i][k]))
                {
                    arr[j][k] = arr[j][i]+arr[i][k];
                }
                }
            }
            }
        }
        System.out.println("The shortest path matrix is given by: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
