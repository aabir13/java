//Code to demonstrate comparison between arrays using compare() function in Arrays Class
import java.util.*;
public class ArrayClass4 
{
    public static void main(String[] args)
    {
        int ar1[] = {1,2,3,4,5};
        int ar2[] = {1,3,4};
        System.out.println(Arrays.compare(ar1,ar2));
        System.out.println(Arrays.compareUnsigned(ar1,ar2));
    }  
}