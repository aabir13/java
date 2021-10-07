/*Code to find the number of pairs of elements in the array whose sum is equal to k.
Sample Input 1:
4 6
1 5 7 1
Sample Output 1:
2

Sample Input 2:
4 2
1 1 1 1
Sample Output 2:
6
*/
import java.util.*;
public class ElementPairs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        int c=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if((ar[i]+ar[j])==k)
                    c++;
            }
        }
        System.out.println("Number of pairs in the given array that sum upto "+k+" are: "+c);
        sc.close();
    }
}