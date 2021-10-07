/*Given an unsorted array A of size n that contains only non-negative integers
Code to find a continuous sub-array which adds to a given number S.
Sample Input:
N = 5, S = 12
A[] = {1,2,3,7,5}

Sample Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.
*/
import java.util.*;
public class ContiguousSubarraySum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        int a=0, b=0;
        for(int i=0; i<n; i++)
        {
            int sum=0;
            for(int j=i; j<n; j++)
            {
                sum+=ar[j];
                if(sum == s)
                {
                    a=i;
                    b=j;
                    break;
                }
            }
            if(a!=0 || b!=0)
                break;
        }
        if(a==0 && b==0)
            System.out.println("No contiguous subarray exists which can produce the desired sum");
        else
            System.out.println("Indexes that produce the sum are: "+a+"&"+b);
        sc.close();
    }
}