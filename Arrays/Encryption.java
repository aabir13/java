/*An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let L be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:
floor of sqrt(L)<=row<=column<=ceil of sqrt(L)

string s: a string to encrypt
Returns
string: the encrypted string
Input Format
One line of text, the string s

Sample Input 1:
haveaniceday
Sample Output 1:
hae and via ecy
Explaination: the grid values distribute in a manner L=sqrt(L), floor value=3, ceil value=4;
3 rows, 4 columns
Matrix formed:
have
anic
eday

Sample Input 2:
feedthedog    
Sample Output 2:
fto ehg ee dd

Sample Input 3:
chillout
Sample Output 3:
clu hlt io
*/

import java.util.*;
public class Encryption 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        double L=s.length();
        double sqr = Math.sqrt(L);
        int c=(int)Math.ceil(sqr);
        char ar[][]=new char[c][c];
        int k=0;
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(k>=L)
                    ar[i][j]=' ';
                else
                    ar[i][j]=s.charAt(k++);
            }
        }
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(ar[j][i]!=' ')
                {
                    System.out.print(ar[j][i]);
                }
            }
            System.out.print(" ");
        }
        sc.close();
    }    
}