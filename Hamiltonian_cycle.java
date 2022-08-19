import java.util.*;
class Main   
{
    static int i,j,flag = 0;
    static int adj[][] = new int[10][10];
    static int x[] = new int[10],n;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        n = input.nextInt();
        System.out.println("Enter the adjacency matrix:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                adj[i][j] = input.nextInt();
            }
            x[i] = 0;
        }
        x[1] = 1;
        Hamiltonian(2);
        if(flag == 0)
        {
            System.out.println("No Hamiltonian cycle present for the given graph");
        }
    }
    static void Hamiltonian(int k)
    {
        do  
        {
            getVal(k);
            if(x[k] == 0)
            {
                return;
            }
            if(k==n)
            {
                flag = 1;
                System.out.println("The path of the given Hamiltonian graph is given by:");
                for(i=1;i<=n;i++)
                {
                    System.out.print(x[i]+"->");
                }
                System.out.println("1");
            }
            else
            {
                Hamiltonian(k+1);
            }
        }while(true);
    }
    static void getVal(int k)
    {
        do{
            x[k] = ((x[k]+1) % (n+1));
            if(x[k] == 0)
            {
                return;
            }
            if((adj[x[k-1]][x[k]])==1)
            {
                for(j=1;j<=n;j++)
                {
                    if(x[j] == x[k])
                    {
                        break;
                    }
                }
                if(j==k)
                {
                    if((k<n) || ((k == n) && (adj[x[n]][x[1]]==1)))
                    {
                        return;
                    }
                }
            }
        }while(true);
    }
}
