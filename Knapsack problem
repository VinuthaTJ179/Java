import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Enter the number of elements:");
    int n = input.nextInt ();
      System.out.println ("Enter the corresponding weights and profits:");
    int weight[] = new int[n], profit[] = new int[n], i;
    for (i = 0; i < n; i++)
      {
	weight[i] = input.nextInt ();
	profit[i] = input.nextInt ();
      }
    double ratio[] = new double[n];
    for (i = 0; i < n; i++)
      {
	ratio[i] = (double) profit[i] / weight[i];
      }
    System.out.println ("Enter the capacity of the bag:");
    int capacity = input.nextInt ();
    knapsack (n, capacity, weight, profit, ratio);
  }
  static void knapsack (int n, int c, int weight[], int profit[],
			double ratio[])
  {
    double current_weight = 0, current_profit = 0;
    while (current_weight < c)
      {
	int index = get_new (n, ratio);
	if (index == -1)
	  {
	    break;
	  }
	if ((current_weight + weight[index]) < c)
	  {
	    current_weight += weight[index];
	    current_profit += profit[index];
	  }
	else
	  {
	    current_profit +=
	      ((double) (c - current_weight) / weight[index]) * profit[index];
	    break;
	  }
      }
    System.out.println ("Maximum profit: " + current_profit);
  }
  static int get_new (int n, double ratio[])
  {
    double largest = ratio[0];
    int i, index = -1;
    for (i = 0; i < n; i++)
      {
	if (ratio[i] >= largest)
	  {
	    largest = ratio[i];
	    index = i;
	  }
      }
    ratio[index] = -1;
    return index;
  }
}
