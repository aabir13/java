//Code to calculate the minimum and maximum element of an array
import java.util.*;
public class MinMaxElement 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]= new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(ar[i]>max)
                max=ar[i];
            if(ar[i]<min)
                min=ar[i];
        }
        System.out.println("Max Element of Array: "+max);
        System.out.println("Min Element of Array: "+min);
        sc.close();
    }    
}
