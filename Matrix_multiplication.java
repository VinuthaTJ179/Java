import java.util.Scanner;
class Main  
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int []arr[];
        arr = new int [3][3];
        int array[][] = new int[3][3];
        int []sum[] = new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j] = 0;
                for(int k=0;k<3;k++)
                {
                    sum[i][j]+=arr[i][k]*array[k][j];
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
