/*Code to find all the common elements in three given arrays.
To print the common elements and if no common element then print -1.
Sample Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Sample Output:
20 80
*/
import java.util.*;
public class DuplicateElementsInThreeArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int ar1[] = new int[n1];
        for(int i=0; i<n1; i++)
            ar1[i]=sc.nextInt();
        int n2=sc.nextInt();
        int ar2[] = new int[n2];
        for(int i=0; i<n2; i++)
            ar2[i]=sc.nextInt();
        int n3=sc.nextInt();
        int ar3[] = new int[n3];
        for(int i=0; i<n3; i++)
            ar3[i]=sc.nextInt();
        System.out.println("Common elements are: ");
        int i=0, j=0, k=0;
        while(i<ar1.length && j<ar2.length && k<ar3.length)
        {
            if(ar1[i] == ar2[j] && ar2[j]==ar3[k])
            {
                System.out.print(ar1[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(ar1[i]<ar2[j])
                i++;
            else if(ar2[j]<ar3[k])
                j++;
            else
                k++;
        }
        sc.close();
    }
}