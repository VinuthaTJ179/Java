import java.util.Scanner;
class Main  
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = input.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the adjacent matrix:");
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j] = input.nextInt();
            }
        }
        int visited[] = new int[n],unvisited[] = new int[n],src,k=0,min_val=0,x=0,y=0;
        for(i=0;i<n;i++)
        {
            visited[i] = 0;
            unvisited[i] = 1;
        }
        System.out.println("Enter the source:");
        src = input.nextInt();
        visited[src-1] = 1;
        unvisited[src-1] = 0;
        for(i=1;i<n;i++){
            int min = 999;
            for(j=0;j<n;j++){
                if(visited[j]==1){
                    for(k=0;k<n;k++){
                        if(unvisited[k]==1 && arr[j][k]!=999)
                        {
                            if(min>arr[j][k])
                            {
                                min = arr[j][k];
                                x = j;
                                y = k;
                            }
                        }
                    }
                }
            }
            System.out.println("Edges: "+"("+x+"-"+y+")"+" Weight: "+min);
            visited[y] = 1;
            unvisited[y] = 0;
            min_val+=min;
        }
        System.out.println("The minimum cost of the weighted graph is:"+min_val);
    }
}
