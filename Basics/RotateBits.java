/*Given an integer N and D, you have to write a program to rotate the binary representation of N by D. 
The binary representation of the integer N by D digits is rotated to the left as well as right. 
Print the results in decimal values after each of the rotations.
Sample Input:
10
2
Sample Output:
40
163842
*/
import java.util.*;
public class RotateBits
{
    static final int bits = 16;
    static int leftRotate(int n, int d) 
    {
        return (n << d) | (n >> (bits - d));
    }
    static int rightRotate(int n, int d) 
    {
        return (n >> d) | (n << (bits - d));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("Left Rotation of "+n+" by "+d+" is ");
        System.out.println(leftRotate(n, d));
        System.out.print("Right Rotation of "+n+" by "+d+" is ");
        System.out.print(rightRotate(n, d));
    }
}