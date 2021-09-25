/*Code to make the following pattern
    1
   212
  32123
 4321234
543212345
*/
public class Pattern5
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--)
            {
                System.out.print(k);
            }
            for(int l=1; l<i; l++)
            {
                System.out.print(l+1);
            }
            System.out.println();
        }
    } 
}