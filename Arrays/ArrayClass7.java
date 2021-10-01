//Code to demonstrate equals() method of Array Class
import java.util.*;
public class ArrayClass7 
{
    public static void main(String[] args)
    {
        int ar1[][] = {{10,20,15,22,35}};
        int ar2[][] = {{10,15,22}};
        //To compare both arrays
        System.out.println("Integer Arrays on comparison: "+Arrays.equals(ar1,ar2));
    }
}
