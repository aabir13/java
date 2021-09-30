//Code to demonstrate the usefulness of hasNext()
import java.util.*;
public class HasNext 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext())
        {
            String s=sc.next();
            if(s.equals("q"))
                break;
            int n=sc.nextInt();
            System.out.println(n+". "+s);
        }
        sc.close();
    }
}
