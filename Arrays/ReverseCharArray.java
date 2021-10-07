//Code to reverse a String as an array
import java.util.*;
public class ReverseCharArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println("Original String: "+st);
        int l=st.length();
        char ch[] = st.toCharArray();
        char c[]=new char[l];
        for(int i=0; i<l; i++)
            c[l-1-i]=ch[i];
        System.out.print("Reversed String: ");
        for(char a:c)
            System.out.print(a);
        sc.close();
    }
}