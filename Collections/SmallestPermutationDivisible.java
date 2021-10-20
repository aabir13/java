/*Find the smallest number which is a multiple of d, that could be formed by permuting the digits of N. 
You must use all the digits of N, and if the smallest multiple of d has leading zeros, they can be dropped. 
If no such number exists, the output will be -1.
Sample Input 1:
210
2
Sam1ple Output 1:
12

Sample Input 2:
1707693158
853684
Sample Output 2:
513917768

Sample Input 3:
531
2
Sample Output 3:
-1
*/
import java.util.*;
public class SmallestPermutationDivisible
{
    public static List<String> findPermutations(String str)
    {
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++)
        {
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++)
                {
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
        return partial;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n = sc.next();
        long d=sc.nextLong();
        n=n.replace("0","");
        List<String> a = new ArrayList<>();
        a = findPermutations(n);
        Collections.sort(a);
        int l = a.size();
        int c=0; long k=0;
        for(int i=0; i<l; i++)
        {
            long element = Long.parseLong(a.get(i));
            if(element%d == 0)
            {
                c=0;
                k=element;
                break;
            }
            else
                c++;
        }
        if(c==0)
            System.out.println(k);
        else
            System.out.println("-1");
    }
}