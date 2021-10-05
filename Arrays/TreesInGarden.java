/*Arya Stark of Winterfell is very much interested in gardening and she decides to plant more trees in her garden. 
She plants trees in the order of rows and columns. She numbered the trees in column wise order. 
She planted the orange trees only in the second column from both first and last. 
But later when the trees grew up, she forgot where she planted orange trees. 
So help her find out whether the given tree number is a number of orange trees or not. 
Display whether “It is an orange tree” or “It is not an orange tree”.

INPUT FORMAT:
Input consists of 3 integers.
First input corresponds to the number of rows.
Second input corresponds to the number of columns.
Third input corresponds to the tree number.

SAMPLE INPUT:
5
5
20

SAMPLE OUTPUT:
It is an orange tree
*/

import java.util.Scanner;
public class TreesInGarden
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int tree=sc.nextInt();
        int ar[][]=new int[rows][columns];
        int c=1;
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                ar[j][i]=c;
                c++;
            }
        }
        int k=0;
        for(int i=0; i<rows; i++)
        {
            if(ar[i][1]==tree || ar[i][columns-2]==tree)
                k=1;
        }
        if(k==1)
            System.out.println("It is an orange tree.");
        else
            System.out.println("It is not an orange tree");
        System.out.println("Trees placed in garden: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                System.out.print(ar[i][j]+"\t");    
            }
            System.out.println();
        }
        sc.close();
    }
}