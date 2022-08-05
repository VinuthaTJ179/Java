import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = input.nextInt(),i,j,src;
        int arr[][] = new int[n][n];
        System.out.println("Enter the cost adjacency matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the source vertex:");
        src = input.nextInt();
        dijkstra(arr,src,n);
    }
    public static void dijkstra(int arr[][],int src,int n)
    {
        int distance[] = new int [n],visited[] = new int[n],i,count = 0,next_node = 0;
        for(i=0;i<n;i++)
        {
            distance[i] = arr[src][i];
            visited[i] = 0;
        }
        visited[src] = 1;
        distance[src] = 0;
        count = 1;
        while(count<(n-1))
        {
            int min_distance = 999;
            for(i=0;i<n;i++)
            {
                if((min_distance>distance[i])&&(visited[i]==0))
                {
                    min_distance = distance[i];
                    next_node = i;
                }
            }
            visited[next_node] = 1;
            for(i=0;i<n;i++)
            {
                if(visited[i]==0)
                {
                    if((min_distance+arr[next_node][i])<distance[i])
                    {
                        distance[i] = min_distance+arr[next_node][i];
                    }
                }
            }
            count++;
        }
        for(i=0;i<n;i++)
        {
            if(i!=0)
            {
                System.out.println("Distance from source to: "+i+" is "+distance[i]);
            }
        }
    }
}
