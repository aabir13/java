//Code to determine the count for all the elements of the array
import java.util.*;
public class CountElements 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int count[]=new int[101];
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
            count[ar[i]]++;
        }
        for(int i=0; i<n; i++)
        {
            System.out.println("Value: "+ar[i]+"\tCount: "+count[ar[i]]);
        }
        sc.close();
    }
}
