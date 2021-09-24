//Code to demonstrate conversion to binary in string variable and printing the maximum number of continuous 1s
import java.util.*;
public class Binary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        int counter = 0;
        String bin = Integer.toBinaryString(n);
        System.out.println("Binary Number: "+bin);
        int max=0;
        for(int i=0;i<bin.length();i++)
        {
            counter = (bin.charAt(i) == '1')?counter+1:0;
            if(max<counter)
                max=counter;
        }
        System.out.println("Maximum number of 1s available: "+max);
        sc.close();
    }
}