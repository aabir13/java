//Code to understand various ways how we can comapre strings
import java.util.*;
public class stringComparison 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        //using equals()
        System.out.println(s1.equals(s2));//case sensitive comparison
        System.out.println(s1.equalsIgnoreCase(s2));//ignores the case and compares
        //using == operator
        String s3= new String("Aabir Datta");
        System.out.println(s1==s2);//refers to same instance hence it will give correct output
        System.out.println(s1==s3);//s3 refers to instance created in nonpool hence even if the strings will be same the output will be false
        //using compareTo()
        //returns 0 if equal, -1 if s1<s2 and 1 if s1>s2
        System.out.println(s1.compareTo(s2));
    }
    
}
