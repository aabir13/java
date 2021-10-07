/*Code to cyclically rotate an array
To shift the element towards right by 1. 
The last element in this case comes to the first
Sample Input: 1 2 3 4 5
Sample Output: 5 1 2 3 4
*/
import java.util.*;
public class CyclicallyRotate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        System.out.println("Original Array: "+Arrays.toString(ar));
        int last=ar[n-1];
        for(int i=4; i>0; i--)
            ar[i]=ar[i-1];
        ar[0]=last;
        System.out.println("Cyclically Rotated Arrays: "+Arrays.toString(ar));
        sc.close();
    }
}