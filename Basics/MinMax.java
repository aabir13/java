//Code to take input from the user as long as the user wants and print the minimum and maximum values of the input ones
import java.util.*;
public class MinMax 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char c;
        do
        {
            System.out.println("Do you want to enter a number?[Y/N]");
            c = sc.next().charAt(0);
            if(c == 'Y')
            {
                System.out.println("Enter a number");
                int num = sc.nextInt();
                if(num<min)
                {
                    min = num;
                }
                if(num>max)
                {
                    max = num;
                }
            }
        }while(c=='Y');
        System.out.println("The minimum of the input numbers: "+min);
        System.out.println("The maximum of the input numbers: "+max);
        sc.close();
    }   
}