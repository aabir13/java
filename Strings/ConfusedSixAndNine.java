/*Pappu is confused between 6 & 9. 
He works in the billing department of ABC company and his work is to return the remaining amount to customers. 
If the actual remaining amount is given, find the maximum possible extra amount given by Pappu to the customers.
For example:-
If the actual remaining amount = 56. Then maximum possible extra amount = (59 - 56 ) = 3
Sample Input 1:
3
6
66
666
Sample Output 1:
3
33
333

Sample Input 2:
2
56
59
Sample Output 2:
3
0
*/
import java.util.*;
public class ConfusedSixAndNine
{
    static int confusion(String x)
    {
        int l=x.length();
        String st="";
        for(int i=0; i<l; i++)
        {
            if(x.charAt(i) == '6')
                st=st+'9';
            else
                st=st+x.charAt(i);
        }
        int n1=Integer.parseInt(x);
        int n2=Integer.parseInt(st);
        return (n2-n1);
    }
    public static void main(String strings[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
            String n=sc.next();
            System.out.println(confusion(n));
        }
    }
}