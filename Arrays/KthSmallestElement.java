/*Code to find to find the Kth smallest element in the given array.
K is smaller than size of array
It is given that all array elements are distinct.
Sample Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3

Sample Output:
7

Explanation: 
3rd smallest element in the given array is 7.
*/
import java.util.*;
public class KthSmallestElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("Given Array: "+Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("The "+n+"th smallest element in the array is: "+ar[k-1]);
        sc.close();
    }
}