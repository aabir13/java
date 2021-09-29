//Code to sort an array using sort() function of Arrays Class
import java.util.*;
public class ArrayClass2 
{
    public static void main(String[] args)
    {
        int ar[] = {5,2,1,4,7,3};
        Arrays.sort(ar);
        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i]+"\t");
    }
    
}
