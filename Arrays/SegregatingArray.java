/*Code to segregate elements, by pushing all negative elements to one side of the array
The negative elements must be placed at the end of array without changing the order of positive element and negative element.
Sample Input: 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

Sample Output: 
1  3  2  11  6  -1  -7  -5
*/
import java.util.*;
public class SegregatingArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        System.out.println("Unsegregated Array: "+Arrays.toString(ar));
        int arr[]=new int[n];
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(ar[i]>=0)
            {
                arr[c]=ar[i];
                c++;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(ar[i]<0)
            {
                arr[c]=ar[i];
                c++;
            }
        }
        System.out.println("Segregated Array: "+Arrays.toString(arr));
        sc.close();
    }
}