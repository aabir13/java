/* Take an array of length n where all the numbers are nonnegative and unique. 
Find the element in the array possessing the highest value. 
Split the element into two parts where first part contains the next highest value in the array 
and second part hold the required additive entity to get the highest value. 
Print the array where the highest value get splitted into those two parts.

Sample input: 4 8 6 3 2
Sample output: 4 6 2 6 3 2 
*/
import java.util.*;
public class SplitElement 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
            a[i]=ar[i];
        }
        System.out.println("Original Array: "+Arrays.toString(ar));
        Arrays.sort(ar);
        int max=ar[n-1];
        int s=ar[n-2];
        int temp = max-s;
        System.out.print("Final Array: ");
        for(int i=0; i<n; i++)
        {
            if(a[i]==max)
                System.out.print(s+" "+temp+" ");
            else
                System.out.print(a[i]+" ");
        }
        sc.close();
    }    
}
