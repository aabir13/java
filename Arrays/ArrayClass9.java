//Code to demonstrate mismatch() method of Arrays Class
import java.util.*;
public class ArrayClass9 
{
    public static void main(String[] args)
    {
        int ar1[]={10,20,15,22,35};
        int ar2[]={10,15,22};
        //To compare both arrays
        System.out.println("The element mismatched at index: "+Arrays.mismatch(ar1,ar2));
    }    
}
