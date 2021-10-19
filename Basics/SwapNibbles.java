/*Given a byte, swap the two nibbles in it. For example, 100 is be represented as 01100100 in a byte (or 8 bits). 
The two nibbles are (0110) and (0100). 
If we swap the two nibbles, we get 01000110 which is 70 in decimal.
Sample Input 1:
100
Sample Output 1:
70

Sample Input 2:
129
Sample Output 2:
24
*/
import java.util.*;
public class SwapNibbles 
{
    static int swapNibbles(int n)
    {
        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(swapNibbles(n));
    }
}