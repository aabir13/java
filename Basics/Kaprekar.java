//To check whether the number is a Kaprekar number or not
import java.util.*;
public class Kaprekar 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int p=n*n;
        int c=0, k=0;
        while(p>0)
        {
            k=p%10;
            c+=k;
            p=p/10;
        }
        if(c==n)
        {
            System.out.println("Kaprekar Number");
        }
        else
        {
            System.out.println("Not a Kaprekar Number");
        }
        sc.close();
    }    
}
