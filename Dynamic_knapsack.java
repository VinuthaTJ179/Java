//Dynamic knapsack
import java.util.*;
class Main   
{
    static int n;
    static int w[] = new int[10];
    static int p[] = new int[10];
    static int V[][] = new int[10][10],c,i,j;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = input.nextInt();
        System.out.println("Enter the corresponding weights and profits:");
        for(i=1;i<=n;i++)
        {
            w[i] = input.nextInt();
            p[i] = input.nextInt();
        }
        System.out.println("Enter the capacity:");
        c = input.nextInt();
        dynamic_knapsack();
    }
    public static void dynamic_knapsack()
    {
        for(i=0;i<=n;i++)
        {
            V[i][0] = 0;
        }
        for(j=0;j<=c;j++)
        {
            V[0][j] = 0;
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(j<w[i])
                {
                    V[i][j] = V[i-1][j];
                }
                else
                {
                    V[i][j] = Math.max(V[i-1][j],p[i]+V[i-1][j-w[i]]);
                }
            }
        }
        System.out.println("The optimal solution is:"+V[i-1][j-1]);
    }
}
