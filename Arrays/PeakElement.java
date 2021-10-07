/*An element is called a peak element if its value is not smaller than the value of its adjacent elements.
Given an array arr[] of size N, find the index of any one of its peak elements
Print 1 if a peak element exists else print 0
*/
import java.util.*;
public class PeakElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        for(int i=1; i<n-1; i++)
        {
            if(ar[0]>ar[1])
            {
                System.out.println("1");
                break;
            }
            else if(ar[n-1]>ar[n-2])
            {
                System.out.println("1");
                break;
            }
            else if(ar[i]>ar[i-1] && ar[i]>ar[i+1])
            {
                System.out.println("1");
                break;
            }
            else
            {
                System.out.println("0");
            }
        }
        sc.close();
    }
}