/*Alice Apple Trees
In a garden, there are several apple trees planted in a grid format. Each point (i, j) in the grid has | i | + | j | apples. 
Alice can buy a square plot centered at (0, 0). 
Find the minimum perimeter of the plot (1 unit having length = 1) such that she can collect at least X apples. 
All plants on the perimeter of the plot are also included.

Format:

Input:
X denotes the number of apples Alice has to collect.

Output:
Your function should return the minimum perimeter of the plot, which should be bought by Alice.

Example:
Input:
1
Output:
8

Explanation:
Apples in each unit square will be | i | + | j | as a length of 1 unit will contain 0 apples (0,0). Hence, a plot of side length 2 will be taken keeping (0, 0) at the center.

Input (stdin)
24

Output (stdout)
16
*/

import java.util.*;
public class AliceAppleTrees
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double t=0.0;
        int unit=0;
        while(n>t)
        {
            unit++;
            t+=12*Math.pow(unit,2);
        }
        System.out.println(8*unit);
        sc.close();
    }
}