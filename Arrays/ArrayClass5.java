//Code to copy one array into another using copyOf() function in Arrays Class
import java.util.*;
public class ArrayClass5 
{
    public static void main(String[] args)
    {
        int ar1[] = {1,2,3,4,5};
        System.out.println("Integer Array: "+Arrays.toString(ar1));
        System.out.println("New Array copied from input array: "+Arrays.toString(Arrays.copyOf(ar1,10)));
    }
}