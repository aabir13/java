/*Code to find all the elements occurring more than once in the given array.
Given an array a[] of size n which contains elements from 0 to n-1.
Sample Input 1:
4
0 3 1 2
Sample Output 1:
-1

Sample Input 2:
5
2 3 1 2 3
Sample Output 2:
2 3
*/
import java.util.*;
public class DuplicateElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
            ar[i]=sc.nextInt();
        System.out.println("Original Array: "+Arrays.toString(ar));
        int c=0;
        String st="";
        System.out.print("Duplicate Numbers in the array: ");
        for(int i=0; i<n; i++)
        {
            c=0;
            for(int j=0; j<n; j++)
            {
            if(ar[i]==ar[j])
                c++;
            }
            String s=String.valueOf(ar[i]);
            boolean b=st.contains(s);
            if(c>1 && b==false)
                st=st+ar[i]+" ";
        }
        if(st.equals(""))
            System.out.println("-1");
        else
            System.out.println(st);
        sc.close();
    }
}