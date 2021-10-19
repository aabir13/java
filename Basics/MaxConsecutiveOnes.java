/*Given a number N, the task is to find the length of the longest consecutive 1's in its binary format.
Sample Input 1:
2
14
222
Sample Output 1:
3
4

Sample Input 2:
2
54
22
Sample Output 2:
2
2
*/
import java.util.*;
public class MaxConsecutiveOnes
{
    static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        while (x!=0)
        {
            x = (x & (x << 1));
            count++;
        }
        return count;
    }
    public static void main(String strings[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=sc.nextInt();
            System.out.println(maxConsecutiveOnes(n));
        }
    }
}