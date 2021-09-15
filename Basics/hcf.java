//Code to calculate the Highest Common Factor of two input numbers
import java.util.*;
public class hcf
{
   public static void main(String args[])
   {
      int a, b, hcf = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      a = sc.nextInt();
      System.out.println("Enter second number");
      b = sc.nextInt();
      for(int i = 1; i <= a || i <= b; i++) 
      {
         if(a%i == 0 && b%i == 0)
         hcf = i;
      }
      System.out.println("HCF of given two numbers is: "+hcf);
      sc.close();
   }
}
