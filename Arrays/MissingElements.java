/*Code to find the missing element from an array of size (n-1),
such that it only contains distinct integers in the range of 1 to n.
Sample Input 1:
5
1 2 3 5
Sample Output 1:
4

Sample Input 2:
10
6 1 2 8 3 4 7 10 5
Sample Output 2:
9
*/
import java.util.*;
public class MissingElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n-1];
        int a[] = new int[n];
        for(int i=0; i<n-1; i++)
            ar[i]=sc.nextInt();
        System.out.println("Original Array: "+Arrays.toString(ar));
        for(int i=0; i<ar.length; i++)
        {
            int t=ar[i];
            a[t-1]=t;
        }
        for(int i=0; i<ar.length; i++)
        {
            if(a[i]==0)
            {
                System.out.println(i+1);
                break;
            }
        }
        sc.close();
    }
}