/*Code to calculate the length of union of two arrays.
Sample Input 1:
5 3
1 2 3 4 5
1 2 3
Sample Output 1:
5

Sample Input 2:
6 2 
85 25 1 32 54 6
85 2
Sample Output 2:
7
*/
import java.util.*;
public class UnionOfArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ar1[] = new int[n1];
        int ar2[] = new int[n2];
        for(int i=0; i<n1; i++)
            ar1[i]=sc.nextInt();
        for(int i=0; i<n2; i++)
            ar2[i]=sc.nextInt();
        System.out.println("Original Array 1: "+Arrays.toString(ar1));
        System.out.println("Original Array 2: "+Arrays.toString(ar2));
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<n1; i++)
        {
            ar.add(ar1[i]);
        }
        for(int i=0; i<n2; i++)
        {
            if(ar.contains(ar2[i]) == false)
            {
                ar.add(ar2[i]);
            }
        }
        System.out.println("Union of two arrays: "+ar);
        System.out.println("Length of the union array: "+ar.size());
        sc.close();
    }
}